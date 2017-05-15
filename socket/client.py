import socket

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.connect(('127.0.0.1', 9000))

server.send(b'GET /aa.html HTTP/1.1\r\n')
data = server.recv(1024).decode('utf-8').split("\r\n\r\n")[1]
print(data)

server.close()