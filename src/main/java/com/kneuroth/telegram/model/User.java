package com.kneuroth.telegram.model;
// https://core.telegram.org/bots/api#user
public record User(Integer id, String first_name, String last_name, String username) {
}
