package com.manchesterdigital;

import java.util.Objects;

public class SpotifyAccount {


    private final String username;
    private final String password;

    public SpotifyAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SpotifyAccount)) return false;
        SpotifyAccount that = (SpotifyAccount) o;
        return Objects.equals(username, that.username) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}
