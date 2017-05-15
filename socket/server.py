import socket

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server.bind(('127.0.0.1', 9000))
server.listen(10)

(client, addr) = server.accept()
print('connect by', addr)

data = client.recv(1024)
print(data)

docroot = "/home/nancy/project/socket"
path = docroot + data.split(" ")[1]
file = open(path, 'r')
content = file.read()
head = "HTTP/1.1 200 OK\r\nContent-Type: text/html\r\nContent-Length: " + str(len(content)) + "\r\n"
msg = head + "\r\n" + content
print(msg)
client.send(msg.encode())

client.close()