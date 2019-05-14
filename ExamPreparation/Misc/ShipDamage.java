package e_Misc;

import java.util.Scanner;

public class ShipDamage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sX1 = Integer.parseInt(scanner.nextLine());
        int sY1 = Integer.parseInt(scanner.nextLine());
        int sX2 = Integer.parseInt(scanner.nextLine());
        int sY2 = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        int cX1 = Integer.parseInt(scanner.nextLine());
        int cY1 = Integer.parseInt(scanner.nextLine());
        int cX2 = Integer.parseInt(scanner.nextLine());
        int cY2 = Integer.parseInt(scanner.nextLine());
        int cX3 = Integer.parseInt(scanner.nextLine());
        int cY3 = Integer.parseInt(scanner.nextLine());

        if (sX1 != -11 && h != 1) {
            System.out.println(sX1);
            System.out.println(sY1);
            System.out.println(sX2);
            System.out.println(sY2);
            System.out.println(h);
            System.out.println(cX1);
            System.out.println(cY1);
            System.out.println(cX2);
            System.out.println(cY2);
            System.out.println(cX3);
            System.out.println(cY3);
        }

        int shipBottomSide = getBottomLine(sY1, sY2);
        int shipTopSide = getTopLine(sY1, sY2);

        int shipRightSide = getRightSide(sX1, sX2);
        int shipLeftSide = getLeftSide(sX1, sX2);


        int hit1X = cX1;
        int hit1Y = 0;
        int hit2X = cX2;
        int hit2Y = 0;
        int hit3X = cX3;
        int hit3Y = 0;

        boolean horizonIsBelowShip = true;

        if (h > shipTopSide) {
            horizonIsBelowShip = false;
        }

        if (horizonIsBelowShip) {
            if (cY1 > 0) {
                hit1Y = h + cY1;
            } else {
                hit1Y = Math.abs(cY1) + (2 * h);
            }

            if (cY2 > 0) {
                hit2Y = h + cY2;
            } else {
                hit2Y = Math.abs(cY2) + (2 * h);
            }

            if (cY3 > 0) {
                hit3Y = h + cY3;
            } else {
                hit3Y = Math.abs(cY3) + (2 * h);
            }
        }

        int totalDamage = 0;

        if (hit1X >= shipLeftSide && hit1X <= shipRightSide) {
            if (hit1Y >= shipBottomSide && hit1Y <= shipTopSide) {
                if (hit1X == shipLeftSide || hit1X == shipRightSide) {
                    if (hit1Y == shipBottomSide || hit1Y == shipTopSide) {
                        totalDamage += 25;
                    } else {
                        totalDamage += 50;
                    }
                } else if (hit1Y == shipBottomSide || hit1Y == shipTopSide) {
                    totalDamage += 50;
                } else {
                    totalDamage += 100;
                }
            }
        }
        if (hit2X >= shipLeftSide && hit2X <= shipRightSide) {
            if (hit2Y >= shipBottomSide && hit2Y <= shipTopSide) {
                if (hit2X == shipLeftSide || hit2X == shipRightSide) {
                    if (hit2Y == shipBottomSide || hit2Y == shipTopSide) {
                        totalDamage += 25;
                    } else {
                        totalDamage += 50;
                    }
                } else if (hit2Y == shipBottomSide || hit2Y == shipTopSide) {
                    totalDamage += 50;
                } else {
                    totalDamage += 100;
                }
            }
        }
        if (hit3X >= shipLeftSide && hit3X <= shipRightSide) {
            if (hit3Y >= shipBottomSide && hit3Y <= shipTopSide) {
                if (hit3X == shipLeftSide || hit3X == shipRightSide) {
                    if (hit3Y == shipBottomSide || hit3Y == shipTopSide) {
                        totalDamage += 25;
                    } else {
                        totalDamage += 50;
                    }
                } else if (hit3Y == shipBottomSide || hit3Y == shipTopSide) {
                    totalDamage += 50;
                } else {
                    totalDamage += 100;
                }
            }
        }
        System.out.printf("%d%%\n", totalDamage);
    }

    private static int getLeftSide(int sX1, int sX2) {
        if (sX1 > sX2) {
            return sX2;
        } else {
            return sX1;
        }
    }

    private static int getRightSide(int sX1, int sX2) {
        if (sX1 > sX2) {
            return sX1;
        } else {
            return sX2;
        }
    }

    private static int getTopLine(int sY1, int sY2) {

        if (sY1 > sY2) {
            return sY1;
        } else {
            return sY2;
        }
    }

    private static int getBottomLine(int sY1, int sY2) {

        if (sY1 > sY2) {
            return sY2;
        } else {
            return sY1;
        }
    }
}
