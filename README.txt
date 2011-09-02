Play Framework RabbitMQ Sample Application
Felipe Oliveira
September 1st 2011

1) Consumer

Sample consumer for RabbitMQ is available on app/consumer/RabbitMQSampleConsumer.java.


2) Producer

Sample producer for RabbitMQ is available on app/consumer/RabbitMQSampleFirehose.java. A single message can also be sent to RabbitMQ using RabbitMQPublisher.publish().


3) WebSockets Live Streaming / Stats

Live Streaming of activities, simple UI to to pause/re-start consumers and display activities is available on http://localhost:9000/rabbitmq/.

