package com.zhang.server.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * 消息
 * @author thinkpad
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ChatMsg {

    private String from;
    private String to;
    private String content;
    private LocalDateTime date;
    private String formNickName;
}
