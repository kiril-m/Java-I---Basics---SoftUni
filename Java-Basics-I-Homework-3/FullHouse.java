//In most Poker games, the "full house" hand is defined as three cards of the same face + two cards of the same face, other than the first, regardless of the card's suits. The cards faces are "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" and "A". The card suits are "♣", "♦", "♥" and "♠". Write a program to generate and print all full houses and print their number. 

import java.util.ArrayList;

public class FullHouse {

	public static void main(String[] args) {
		
		//NB - the code is long and the program runs slow (it takes about 10-15 seconds to compute) but it is working! :)  
		//The program is broken down into 4 parts - for the four possible combination of suits of the first 3 cards of the FullHouse and then generation of the possibilities for the other two cards.
		//The four lists are then combined into one big one which is then printed out. 
		
		String[] cards = new String[] { "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "A", "J", "Q", "K" };
		String[] suits = new String[] { "'\u2663'", "'\u2666'", "'\u2665'",
				"'\u2660'" };

		ArrayList<ArrayList<String>> outcome1 = new ArrayList<>();
		ArrayList<ArrayList<String>> outcomeshadow1 = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> outcome2 = new ArrayList<>();
		ArrayList<ArrayList<String>> outcomeshadow2 = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> outcome3 = new ArrayList<>();
		ArrayList<ArrayList<String>> outcomeshadow3 = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> outcome4 = new ArrayList<>();
		ArrayList<ArrayList<String>> outcomeshadow4 = new ArrayList<ArrayList<String>>();
		ArrayList<ArrayList<String>> outcomefinal = new ArrayList<>();
		int count = 0;
		for (int i1 = 0; i1 < cards.length; i1++) {
			for (int i2 = 0; i2 < cards.length; i2++) {
				if (i2 == i1) {
					for (int i3 = 0; i3 < cards.length; i3++) {
						if (i3 == i2) {
							for (int i4 = 0; i4 < cards.length; i4++) {
								for (int i5 = 0; i5 < cards.length; i5++) {
									if (i4 == i5 && i1 != i5) {
										// 1
										ArrayList<String> nextcombo1 = new ArrayList<>();
										nextcombo1.add(cards[i1] + suits[0]);
										nextcombo1.add(cards[i1] + suits[1]);
										nextcombo1.add(cards[i1] + suits[2]);
										for (int fourthcardsuit = 0; fourthcardsuit < suits.length; fourthcardsuit++) {
											if (nextcombo1.size() == 4) {
												nextcombo1.remove(3);
											}
											if (nextcombo1.size() < 5) {
												nextcombo1
														.add(cards[i4]
																+ suits[fourthcardsuit]);
											}

											for (int fifthcardsuit = 0; fifthcardsuit < suits.length; fifthcardsuit++) {
												if (fifthcardsuit != fourthcardsuit
														&& nextcombo1.size() < 5) {
													nextcombo1
															.add(cards[i5]
																	+ suits[fifthcardsuit]);
													ArrayList<String> nextcombo1shadow = new ArrayList<String>();
													for (int shadowcopy = 0; shadowcopy < nextcombo1
															.size(); shadowcopy++) {
														nextcombo1shadow
																.add(nextcombo1
																		.get(shadowcopy));
													}
													outcome1.add(nextcombo1shadow);
													nextcombo1.remove(4);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (int i = 0; i < outcome1.size(); i++) {
			outcomeshadow1.add(outcome1.get(i));
		}
		for (int i = 0; i < outcome1.size(); i++) {
			for (int j = 0; j < outcome1.size(); j++) {
				if (outcome1
						.get(i)
						.get(3)
						.equals(outcome1.get(j)
								.get(4))
						&& outcome1
								.get(i)
								.get(4)
								.equals(outcome1
										.get(j)
										.get(3))) {
					if (outcomeshadow1
							.contains(outcome1
									.get(i))) {
						outcomeshadow1
								.remove(outcome1
										.get(j));

					}
				}
			}
		}
		for (int i = 0; i < outcomeshadow1
				.size(); i++) {
			outcomefinal.add(outcomeshadow1
					.get(i));
		}
		for (int i1 = 0; i1 < cards.length; i1++) {
			for (int i2 = 0; i2 < cards.length; i2++) {
				if (i2 == i1) {

					for (int i3 = 0; i3 < cards.length; i3++) {
						if (i3 == i2) {

							for (int i4 = 0; i4 < cards.length; i4++) {
								for (int i5 = 0; i5 < cards.length; i5++) {
									if (i4 == i5 && i1 != i5) {
										ArrayList<String> nextcombo2 = new ArrayList<>();
										nextcombo2.add(cards[i1] + suits[0]);
										nextcombo2.add(cards[i1] + suits[1]);
										nextcombo2.add(cards[i1] + suits[3]);
										for (int fourthcardsuit = 0; fourthcardsuit < suits.length; fourthcardsuit++) {
											if (nextcombo2.size() == 4) {
												nextcombo2.remove(3);
											}
											if (nextcombo2.size() < 5) {
												nextcombo2
														.add(cards[i4]
																+ suits[fourthcardsuit]);
											}

											for (int fifthcardsuit = 0; fifthcardsuit < suits.length; fifthcardsuit++) {
												if (fifthcardsuit != fourthcardsuit
														&& nextcombo2.size() < 5) {
													nextcombo2
															.add(cards[i5]
																	+ suits[fifthcardsuit]);
													ArrayList<String> nextcombo2shadow = new ArrayList<String>();
													for (int shadowcopy = 0; shadowcopy < nextcombo2
															.size(); shadowcopy++) {
														nextcombo2shadow
																.add(nextcombo2
																		.get(shadowcopy));
													}

													outcome2.add(nextcombo2shadow);
													nextcombo2.remove(4);

												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (int i = 0; i < outcome2.size(); i++) {
			outcomeshadow2.add(outcome2.get(i));
		}
		for (int i = 0; i < outcome2.size(); i++) {
			for (int j = 0; j < outcome2.size(); j++) {
				if (outcome2
						.get(i)
						.get(3)
						.equals(outcome2.get(j)
								.get(4))
						&& outcome2
								.get(i)
								.get(4)
								.equals(outcome2
										.get(j)
										.get(3))) {
					if (outcomeshadow2
							.contains(outcome2
									.get(i))) {
						outcomeshadow2
								.remove(outcome2
										.get(j));
					}
				}
			}
		}
		for (int i = 0; i < outcomeshadow2
				.size(); i++) {
			outcomefinal.add(outcomeshadow2
					.get(i));
		}
		for (int i1 = 0; i1 < cards.length; i1++) {
			for (int i2 = 0; i2 < cards.length; i2++) {
				if (i1 == i2) {

					for (int i3 = 0; i3 < cards.length; i3++) {
						if (i2 == i3) {
							for (int i4 = 0; i4 < cards.length; i4++) {
								for (int i5 = 0; i5 < cards.length; i5++) {
									if (i4 == i5 && i1 != i5) {
										ArrayList<String> nextcombo3 = new ArrayList<>();
										nextcombo3.add(cards[i1] + suits[0]);
										nextcombo3.add(cards[i1] + suits[2]);
										nextcombo3.add(cards[i1] + suits[3]);
										for (int fourthcardsuit = 0; fourthcardsuit < suits.length; fourthcardsuit++) {
											if (nextcombo3.size() == 4) {
												nextcombo3.remove(3);
											}
											if (nextcombo3.size() < 5) {
												nextcombo3
														.add(cards[i4]
																+ suits[fourthcardsuit]);
											}
											for (int fifthcardsuit = 0; fifthcardsuit < suits.length; fifthcardsuit++) {
												if (fifthcardsuit != fourthcardsuit
														&& nextcombo3.size() < 5) {
													nextcombo3
															.add(cards[i5]
																	+ suits[fifthcardsuit]);
													ArrayList<String> nextcombo3shadow = new ArrayList<String>();
													for (int shadowcopy = 0; shadowcopy < nextcombo3
															.size(); shadowcopy++) {
														nextcombo3shadow
																.add(nextcombo3
																		.get(shadowcopy));
													}
													outcome3.add(nextcombo3shadow);
													nextcombo3.remove(4);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (int i = 0; i < outcome3.size(); i++) {
			outcomeshadow3.add(outcome3.get(i));
		}
		for (int i = 0; i < outcome3.size(); i++) {
			for (int j = 0; j < outcome3.size(); j++) {
				if (outcome3
						.get(i)
						.get(3)
						.equals(outcome3.get(j)
								.get(4))
						&& outcome3
								.get(i)
								.get(4)
								.equals(outcome3
										.get(j)
										.get(3))) {
					if (outcomeshadow3
							.contains(outcome3
									.get(i))) {
						outcomeshadow3
								.remove(outcome3
										.get(j));
					}
				}
			}
		}
		for (int i = 0; i < outcomeshadow3
				.size(); i++) {
			outcomefinal.add(outcomeshadow3
					.get(i));
		}
		for (int i1 = 0; i1 < cards.length; i1++) {
			for (int i2 = 0; i2 < cards.length; i2++) {
				if (i2 == i1) {
					for (int i3 = 0; i3 < cards.length; i3++) {
						if (i3 == i2) {

							for (int i4 = 0; i4 < cards.length; i4++) {
								for (int i5 = 0; i5 < cards.length; i5++) {
									if (i4 == i5 && i1 != i5) {
										ArrayList<String> nextcombo4 = new ArrayList<>();
										nextcombo4.add(cards[i1] + suits[1]);
										nextcombo4.add(cards[i1] + suits[2]);
										nextcombo4.add(cards[i1] + suits[3]);
										for (int fourthcardsuit = 0; fourthcardsuit < suits.length; fourthcardsuit++) {
											if (nextcombo4.size() == 4) {
												nextcombo4.remove(3);
											}
											if (nextcombo4.size() < 5) {
												nextcombo4
														.add(cards[i4]
																+ suits[fourthcardsuit]);
											}

											for (int fifthcardsuit = 0; fifthcardsuit < suits.length; fifthcardsuit++) {
												if (fifthcardsuit != fourthcardsuit
														&& nextcombo4.size() < 5) {
													nextcombo4
															.add(cards[i5]
																	+ suits[fifthcardsuit]);
													ArrayList<String> nextcombo4shadow = new ArrayList<String>();
													for (int shadowcopy = 0; shadowcopy < nextcombo4
															.size(); shadowcopy++) {
														nextcombo4shadow
																.add(nextcombo4
																		.get(shadowcopy));
													}

													outcome4.add(nextcombo4shadow);
													nextcombo4.remove(4);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		for (int i = 0; i < outcome4.size(); i++) {
			outcomeshadow4.add(outcome4.get(i));
		}
		for (int i = 0; i < outcome4.size(); i++) {
			for (int j = 0; j < outcome4.size(); j++) {
				if (outcome4
						.get(i)
						.get(3)
						.equals(outcome4.get(j)
								.get(4))
						&& outcome4
								.get(i)
								.get(4)
								.equals(outcome4
										.get(j)
										.get(3))) {
					if (outcomeshadow4
							.contains(outcome4
									.get(i))) {
						outcomeshadow4
								.remove(outcome4
										.get(j));
					}
				}
			}
		}
		for (int i = 0; i < outcomeshadow4
				.size(); i++) {
			outcomefinal.add(outcomeshadow4
					.get(i));
		}
		for (ArrayList<String> list : outcomefinal) {
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j));
				System.out.print(" ");
			}
			System.out.println();
			count++;
		}
		System.out.println(count);
	}

}
