import telnetlib
import threading

class TelnetServer:
    def __init__(self, host, port):
        self.server = telnetlib.Telnet()
        self.server.bind((host, port))
        self.server.listen(5)

    def handle_client(self, client, address):
        print(f"Connected by {address}")
        while True:
            data = client.recv(1024).decode()
            if not data:
                break
            client.send(data.encode())
        client.close()

    def start(self):
        print("Starting Telnet server...")
        while True:
            client, address = self.server.accept()
            client_thread = threading.Thread(target=self.handle_client, args=(client, address))
            client_thread.start()

server = TelnetServer("localhost", 23)
server.start()