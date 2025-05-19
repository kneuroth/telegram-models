package com.kneuroth.telegram.model;
// https://core.telegram.org/bots/api#message
public record Message(Integer message_id, User from, Integer date, Chat chat, String text ) {
}
