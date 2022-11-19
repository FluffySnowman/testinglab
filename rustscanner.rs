use std::net::{TcpStream, TcpListener};
use std::io::{Read, Write};
use std::str;
use std::thread;
use std::sync::mpsc::{Sender, Receiver};
use std::sync::mpsc;
use std::time::Duration;
use std::env;
use std::process;

fn main() {
    let args: Vec<String> = env::args().collect();
    if args.len() != 2 {
        println!("Usage: {} <host>", args[0]);
        process::exit(1);
    }
    let host = &args[1];
    let mut ports = Vec::new();
    for port in 1..65535 {
        ports.push(port);
    }
    let (tx, rx): (Sender<u16>, Receiver<u16>) = mpsc::channel();
    for _ in 0..100 {
        let thread_tx = tx.clone();
        thread::spawn(move || {
            loop {
                let port = thread_tx.recv().unwrap();
                match TcpStream::connect((host, port)) {
                    Ok(_) => println!("{} open", port),
                    Err(_) => {}
                }
            }
        });
    }
    for port in ports {
        tx.send(port).unwrap();
    }
    loop {
        thread::sleep(Duration::from_millis(100));
    }
}
