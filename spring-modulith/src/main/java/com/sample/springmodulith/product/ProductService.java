package com.sample.springmodulith.product;

import com.sample.springmodulith.notification.NotificationDTO;
import com.sample.springmodulith.notification.NotificationService;
import com.sample.springmodulith.product.internal.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class ProductService {

    NotificationService notificationService;

    public void create(Product product) {
        notificationService.createNotification(new NotificationDTO( product.getName(), "SMS",new Date()));
    }
}
