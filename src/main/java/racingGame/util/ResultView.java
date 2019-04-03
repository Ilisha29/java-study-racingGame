package racingGame.util;

import racingGame.model.Car;

import java.util.List;

public class ResultView {
    private static final String RESULT_SIGN = "실행 결과";
    private static final String WINNER_SIGN = "가 최종 우승했습니다. 축하합니다!!";
    private static final char MOVED = '-';

    public static void printResult(List<Car> cars) {
        System.out.println(RESULT_SIGN);
        for (Car car : cars) {
            readPlayerName(car.getPlayerName());
            readCarPosition(car.getCarPosition());
        }
    }

    private static void readPlayerName(String playerName) {
        System.out.print(playerName + " : ");
    }

    private static void readCarPosition(int carPosition) {
        for (int i = 0; i < carPosition; i++) {
            System.out.print(MOVED);
        }
        System.out.println();
    }

    public static void printWinner(List<Car> winnerList) {
        for (int i = 0; i < winnerList.size(); i++) {
            System.out.print(winnerList.get(i).getPlayerName() + " ");
        }
        System.out.println(WINNER_SIGN);
    }
}
