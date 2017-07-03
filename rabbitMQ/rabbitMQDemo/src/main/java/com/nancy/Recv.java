package com.nancy;

import com.rabbitmq.client.*;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Recv
{
    public final static String QUEUE_NAME = "hello";

    public static void main( String[] args ) throws IOException, TimeoutException, InterruptedException {
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("localhost");
        Connection connection = connectionFactory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);

        QueueingConsumer consumer = new QueueingConsumer(channel);
        channel.basicConsume(QUEUE_NAME, true, consumer);
//        while (true)
//        {
            QueueingConsumer.Delivery delivery = consumer.nextDelivery();
            String message = new String(delivery.getBody());
            System.out.println(" [x] Received '" + message + "'");
//        }

        /*Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String s, Envelope envelope,
                                       AMQP.BasicProperties basicProperties,
                                       byte[] bytes) throws IOException {
                String message = new String(bytes, "UTF-8");
                System.out.println(" [x] Recv '" + message + "'");
            }
        };
        channel.basicConsume(QUEUE_NAME, true, consumer);*/
    }
}
