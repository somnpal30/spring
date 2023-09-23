package com.sample.springmodulith.product;

import com.sample.springmodulith.notification.Notification;
import com.sample.springmodulith.notification.NotificationService;
import com.sample.springmodulith.notification.NotificationType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class ProductService {

    NotificationService notificationService;

    public void create(Product product) {
        notificationService.createNotification(new Notification(new Date(), NotificationType.SMS, product.getName()));
    }
}
