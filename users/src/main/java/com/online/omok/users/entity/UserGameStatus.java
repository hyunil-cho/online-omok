package com.online.omok.users.entity;


import com.online.omok.users.entity.base.BaseTimeEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "user_game_status")
public class UserGameStatus extends BaseTimeEntity {

    @Id
    private long userId;

    @Column(name = "games_cnt")
    private int gamesCnt;
    @Column(name = "winning_cnt")
    private int winningCnt;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getGamesCnt() {
        return gamesCnt;
    }

    public void setGamesCnt(int gamesCnt) {
        this.gamesCnt = gamesCnt;
    }

    public int getWinningCnt() {
        return winningCnt;
    }

    public void setWinningCnt(int winningCnt) {
        this.winningCnt = winningCnt;
    }
}
