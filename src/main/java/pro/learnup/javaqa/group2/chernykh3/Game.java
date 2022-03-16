package pro.learnup.javaqa.group2.chernykh3;

public class Game {

    public boolean isGreenLight;
    public int maxSpeed;

    public Game(boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }

    public int droppedOut(int[] speeds) {
        int start = 0;
        if (!isGreenLight) {
            for (int speed : speeds) {
                if (speed > maxSpeed) {
                    start++;
                }
            }
        } else {
            for (int speed : speeds) {
                if (speed < 0) {
                    start++;
                }
            }
        }
        return start;
    }

    public int[] speedDroppedOut(int[] speeds) {
        int cnt = 0;
        if (!isGreenLight) {
            for (int speed : speeds) {
                if (speed > maxSpeed) {
                    cnt++;
                }
            }
        } else {
            for (int speed : speeds) {
                if (speed < 0) {
                    cnt++;
                }
            }
        }
        int[] second = new int[cnt];
        int i = 0;
        if (!isGreenLight) {
            for (int speed : speeds) {
                if (speed > maxSpeed) {
                    second[i] = speed;
                    i++;
                }
            }
        } else {
            for (int speed : speeds) {
                if (speed < 0) {
                    second[i] = speed;
                    i++;
                }
            }
        }
        return second;
    }

    public int[] speedStayedIn(int[] speeds) {
        int cnt = 0;
        if (!isGreenLight) {
            for (int speed : speeds) {
                if (speed <= maxSpeed) {
                    cnt++;
                }
            }
        } else {
            for (int speed : speeds) {
                if (speed >= 0) {
                    cnt++;
                }
            }
        }
        int[] third = new int[cnt];
        int i = 0;
        if (!isGreenLight) {
            for (int speed : speeds) {
                if (speed <= maxSpeed) {
                    third[i] = speed;
                    i++;
                }
            }
        } else {
            for (int speed : speeds) {
                if (speed >= 0) {
                    third[i] = speed;
                    i++;
                }
            }
        }
        return third;
    }

    public String[] survivors(String[] numberLines) {
        int i = 0;
        for (String line : numberLines) {
            String[] parts = line.split(" ");
            int element = Integer.parseInt(parts[1]);
            if (!isGreenLight) {
                if (element <= maxSpeed) {
                    i++;
                }
            } else {
                if (element >= 0) {
                    i++;
                }
            }
        }
        int j = 0;
        String[] output = new String[i];
        for (String winner : numberLines) {
            String[] parts = winner.split(" ");
            int piece = Integer.parseInt(parts[1]);
            String name = parts[0];
            if (!isGreenLight) {
                if (piece <= maxSpeed) {
                    output[j] = name;
                    j++;
                }
            } else {
                if (piece >= 0) {
                    output[j] = name;
                    j++;
                }
            }
        }
        return output;
    }

}
