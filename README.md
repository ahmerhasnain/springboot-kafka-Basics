# springboot-kafka-Basics
This is Basic Spring Boot  and Kafka Producer and Consumer Application where a message is sent with Rest API Query String to a Topic and Consumed
Basic Kafka Commands

STEP 1: DOWNLOAD AND INSTALL KAFKA
https://downloads.apache.org/kafka/3.8.1/kafka_2.13-3.8.1.tgz

Make sure you are in a correct folder to run Kafka Server, In my case the Kafka is places in D:\Kafka

STEP 2: START THE KAFKA ENVIRONMENT
# Start the ZooKeeper service
D:\kafka>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

# Start the Kafka broker service
D:\kafka>.\bin\windows\kafka-server-start.bat .\config\server.properties

STEP 3: CREATE A TOPIC TO STORE YOUR EVENTS
C:\Users\RAMESH\Downloads\kafka>.\bin\windows\kafka-topics.bat --create --topic topic_demo --bootstrap-server localhost:9092

STEP 4: WRITE SOME EVENTS INTO THE TOPIC
D:\kafka>.\bin\windows\kafka-console-producer.bat --topic topic_demo --bootstrap-server localhost:9092
>hello world


STEP 5:  READ THE EVENTS
D:\kafka>.\bin\windows\kafka-console-consumer.bat --topic topic_demo --from-beginning --bootstrap-server localhost:9092
hello world
