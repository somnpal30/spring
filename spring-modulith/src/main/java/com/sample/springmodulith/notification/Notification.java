package com.sample.springmodulith.notification;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@ToString
public class Notification {
    private Date date;
    private NotificationType format;
    private String productName;

}
