import telnetlib
import threading

HOST = 'localhost'  # The server's hostname or IP address
PORT = 5000        # The port used by the server

def handle_client(client):
    while True:
        command = client.read_until(b"\n").decode("utf-8").strip()
        if not command:
            break

        output = execute_command(command)

        client.write(output.encode("utf-8"))

def execute_command(command):
    neofetch
    return output

server = telnetlib.Telnet(HOST, PORT)
print("Telnet server listening on port", PORT)

while True:
    client, addr = server.accept()
    print   ("New client connected from", addr)

    client_thread = threading.Thread(target=handle_client, args=(client,))
    client_thread.start()