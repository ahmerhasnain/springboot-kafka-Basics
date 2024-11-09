package net.javaguides.springboot.Controller;

import net.javaguides.springboot.Kafka.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/api/v1")
@RestController
public class MessageController
{
    private final KafkaProducer producer;
    public MessageController(KafkaProducer producer)
    {
        this.producer = producer;
    }
    @GetMapping(value = "/publish")
    public ResponseEntity<String> Publish(@RequestParam("message") String message)
    {
        producer.sendMessage(message);
        return ResponseEntity.ok("message sent to topic.");
    }
}
