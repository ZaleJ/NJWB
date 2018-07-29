package com.njwb.jzl.java;

import java.util.Random;

// 卡牌类
class Card {
	private int colore = Integer.MAX_VALUE; // 花色
	private int value = Integer.MAX_VALUE; // 值
	private int takePlayer = 0; // 0未被拿，1被玩家1拿，2被玩家2拿，3被玩家3拿

	public Card(int c, int v) {
		this.colore = c; // 定义花色
		this.value = v; // 定义值
	}

	public int getC() {		//	获取花色
		return colore;
	}

	public int getV() {		// 获取值
		return value;
	}

	public void take(int playerNum) {	// 拿牌
		takePlayer = playerNum;
	}

	public boolean isTake() {		// 判断牌是否已被拿走
		if (takePlayer == 0) {
			return false;
		}
		return true;
	}

	public int player() {			// 返回玩家编号
		return takePlayer;
	}

}


// 牌组类
class Cards {

	Card[] cards = new Card[54];

	
	// 构造函数  1，2，3，4f分别代表黑红梅方花色，点数1-13分别代表A-K
	public Cards() {
		int index = 0;
		for (int i = 1; i < 14; i++) {
			for (int j = 1; j < 5; j++) {
				cards[index] = new Card(j, i);
				index++;
			}
		}
		cards[52] = new Card(998, 998);
		cards[53] = new Card(999, 999);
	}

	
	// 判断牌是否拿光
	public boolean allTake() {
		for (Card card : cards) {
			if (card.isTake() == false) {
				return false;
			}
		}
		return true;
	}

	
	// 玩家拿牌
	public int takeCard(int playerNum) {
		Random random = new Random();
		if (!allTake()) {
			while (true) {
				int cardIndex = random.nextInt(54);
				if (!cards[cardIndex].isTake()) {
					cards[cardIndex].take(playerNum);
					return cardIndex;
				}
			}
		}
		return -1;
	}

	
	// 计算炸弹数量
	public int NumBoom(int playNum) {
		int boomTag = 0;
		int[] values = new int[13];
		for (int i = 0; i < values.length; i++) {
			values[i] = i + 1;
		}
		
		// 一般卡牌炸弹
		for (int i = 1; i < 14; i++) {
			int isBoom = 0;
			for (Card card : cards) {
				if (card.getV() == i && card.player() == playNum) {
					isBoom++;
					if (isBoom == 4) {
						boomTag++;
					}
				}
			}
		}
		// 大小王特殊情况炸弹
		if (cards[52].player() == playNum && cards[53].player() == playNum) {
			boomTag++;
		}

		return boomTag;
	}

	// 显示某玩家手牌
	public void playerCards(int playerNum) {
		System.out.println("玩家" + playerNum);
		for (Card card : cards) {
			if (card.player() == playerNum) {
				System.out.print("花色：" + card.getC() + "点数：" + card.getV()+" ");
			}
		}
		System.out.println();
	}

}

public class PlayCards {
	// 发牌方法
	public static Cards giveCards(int player1, int player2, int player3, int dipai, Cards cards) {
		Random random = new Random(54);

		// 题意底牌未知
		
		// for(int i = 0; i < 3; i++) {
		// cards.takeCard(random.nextInt(3)+1);
		// }

		for (int i = 0; i < 51; i++) {
			cards.takeCard(player1);
			cards.takeCard(player2);
			cards.takeCard(player3);
		}

		return cards;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cards cards = new Cards();
		cards = giveCards(1, 2, 3, 4, cards);
		for (int i =1; i < 4; i++) {

			System.out.println("玩家" + i + "炸弹数：" + cards.NumBoom(i));

		}

		cards.playerCards(1);
		cards.playerCards(2);
		cards.playerCards(3);
	}

}
