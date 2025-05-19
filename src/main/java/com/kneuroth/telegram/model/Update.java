package com.kneuroth.telegram.model;
// https://core.telegram.org/bots/api#update
public record Update(Integer update_id, Message message) {
}
