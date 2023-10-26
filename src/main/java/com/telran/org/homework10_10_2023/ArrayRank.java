package com.telran.org.homework10_10_2023;

public interface ArrayRank {

    static Rank[] rank() { // method issues Rank-card names' array
        Rank[] ranks = Rank.values(Rank.two, Rank.three, Rank.four, Rank.five, Rank.six, Rank.seven, Rank.eight, Rank.nine, Rank.ten, Rank.Jack, Rank.Queen, Rank.King, Rank.Ace);
        for (Rank rank : ranks) {
            System.out.println(rank);
        }
        return ranks;
    }

    @Override
    String toString();
}
