package number8_collections.StackQueue;

import number8_collections.collectionsClass.Card;
import number8_collections.collectionsClass.CardComparator;

import java.util.*;

public class StackQueueLauncher {
    public static void main(String[] args) {
        //   passengerProcessing();

        //queue
        Queue<Card> cardDeck = new PriorityQueue<>(52, new CardComparator());
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                cardDeck.add(new Card(suit, face));
            }
        }

        for (int i = 0; i < 0; i++) {
            System.out.println(cardDeck.poll());//����� � ���������
        }
        System.out.println("Deck Size is " + cardDeck.size());

        System.out.println(cardDeck.peek()); //����� ��� ��������
        System.out.println(cardDeck.peek());
        //cardDeck.clear();
        System.out.println("Deck Size is " + cardDeck.size());

        System.out.println("Deque");

        Deque<Card> cards = new ArrayDeque<>();
        for (int i = 0; i < 20; i++) {
            cards.offerFirst(cardDeck.poll());
        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println(cards.pollLast());
//        }

        Card card = new Card(Card.Suit.SPADES, Card.Face.Ten);
        cards.removeFirstOccurrence(card);
        cards.removeLastOccurrence(card);


        /*  System.out.println(cardDeck); //����� � ��������� ���������
        Iterator<Card> iterator = cardDeck.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // �� ����������� ����������� � �����-�� �������
        } */
    }

    private static void passengerProcessing() {
        Stack<Passenger> bus = new Stack<>();
        Passenger passenger = new Passenger("Katerina", "Iavanova");
        bus.push(new Passenger("Alex", "Vasko"));
        bus.push(new Passenger("Viktor", "Mikhailov"));
        bus.push(new Passenger("Dmitrii", "Petrov"));
        bus.push(passenger);
        bus.push(new Passenger("Ivan", "Ivanov"));

        System.out.println("Passenger found at position :" + bus.search(passenger));
        System.out.println("Last entered passenger is: " + bus.peek()); //���������� ������� ������� �� �� ������� ���

        while (!bus.empty()) {
            System.out.println("Passenger :" + bus.pop());//����� ������� ������� � �������
        }

    }

    private static class Passenger {
        private static int number = 1;
        private String name;
        private String surname;

        public Passenger(String name, String surname) {
            number++;
            this.name = name;
            this.surname = surname;
        }

        public static int getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        @Override
        public String toString() {
            return "Passenger " + " " + name + " " + surname;
        }
    }

}
