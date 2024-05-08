package service;

import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyScheduledTasks {

    @Scheduled(every="10s")
    public void myTask() {
        System.out.println("Aqui faço algo a cada 10 segundos");
    }
}