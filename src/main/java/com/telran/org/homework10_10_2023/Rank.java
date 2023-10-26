package com.telran.org.homework10_10_2023;

public enum Rank { // rank o eac h card - rang karti
    two,
    three,
    four,
    five,
    six,
    seven,
    eight,
    nine,
    ten,
    Jack,
    Queen,
    King,
    Ace;

    public static Rank[] values(Rank rank, Rank rank1, Rank rank2, Rank rank3, Rank rank4, Rank rank5, Rank rank6, Rank rank7, Rank rank8, Rank rank9, Rank rank10, Rank rank11, Rank rank12) {
        return new Rank[0];
    }

    @Override
    public String toString() {
        return "Rank{}";
    }
}
