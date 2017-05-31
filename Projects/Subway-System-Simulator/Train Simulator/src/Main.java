
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

final public class Main {

    DefaultTableModel TableModel;
    JTable table;
    JFrame frame;
    DrawPanel drawPanel;
    JLabel speed_text;
    int freightX = 40, freightY = 670;
    double fspeed = 0;
    boolean fup = false, fdown = false, fleft = false, fright = true, fcorner = false;
    boolean moveit = true;

    boolean flag_scheduling = true;

    int b2r_1 = 1;
    long startTime_1;
    boolean flag_1 = false;
    boolean fileRead_1 = false;

    String data[][] = {
        {"1234", " ", " ", " ", " ", " "},
        {"1122", " ", " ", " ", " ", " "},
        {"3344", " ", " ", " ", " ", " "},
        {"5678", " ", " ", " ", " ", " "}};
    String column[] = {"Train Number-1",
        "Origin Station-2",
        "Destination Station-3",
        "Numb Of Stops-4",
        "Train Speed-5",
        "Section Number-6"
    };

    double posX_1 = 40, posY_1 = 35;
    double speed_1 = 0.0;
    boolean tu_1 = false, tdown_1 = false, tleft_1 = false, tright_1 = true;
    int location_1 = 0;
    Queue<Point> next_1 = new LinkedList<Point>();
    Point nextStop_1;

    String[] stations_1 = {"Medford", "Melrose", "Stoneham"};
    ArrayList<String> picked_stations_1 = new ArrayList<>();

    HashMap<String, String> sec2sta_1 = new HashMap<>();
    HashMap<String, Integer> visited_1 = new HashMap<>();

    HashMap<String, ArrayList<Point>> sections_1 = new HashMap<>();
    HashMap<String, Integer> speedLimit_1 = new HashMap<>();
    HashMap<String, Point> switches_1 = new HashMap<>();
    String[] route_1;
    String current_1, next_section_1, prev_1;

    final int LEFT_1 = 0, RIGHT_1 = 1, UP_1 = 2, DOWN_1 = 3, CROSS_RIGHT_1 = 4, CROSS_LEFT_1 = 5, CROSS_RIGHT_UP_1 = 6,
            CROSS_LEFT_UP_1 = 7;
    int dir_1 = RIGHT_1;

    int b2r_2 = 1;
    long startTime_2;
    boolean flag_2 = false;
    boolean fileRead_2 = false;
    double posX_2 = 230, posY_2 = 230;
    double speed_2 = 0.0;
    boolean tu_2 = false, tdown_2 = false, tleft_2 = false, tright_2 = true;
    int location_2 = 0;
    Queue<Point> next_2 = new LinkedList<Point>();
    Point nextStop_2;

    String[] stations_2 = {"Medford", "Alewife", "Melrose", "Stoneham"};
    ArrayList<String> picked_stations_2 = new ArrayList<>();

    HashMap<String, String> sec2sta_2 = new HashMap<>();
    HashMap<String, Integer> visited_2 = new HashMap<>();

    HashMap<String, ArrayList<Point>> sections_2 = new HashMap<>();
    HashMap<String, Integer> speedLimit_2 = new HashMap<>();
    HashMap<String, Point> switches_2 = new HashMap<>();
    String[] route_2;
    String current_2, next_section_2, prev_2;

    final int LEFT_2 = 0, RIGHT_2 = 1, UP_2 = 2, DOWN_2 = 3, CROSS_RIGHT_2 = 4, CROSS_LEFT_2 = 5, CROSS_RIGHT_UP_2 = 6,
            CROSS_LEFT_UP_2 = 7;
    int dir_2 = RIGHT_2;

    int b2r_3 = 1;
    long startTime_3;
    boolean flag_3 = false;
    boolean fileRead_3 = false;

    double posX_3 = 530, posY_3 = 330;
    double speed_3 = 0.0;
    boolean tu_3 = false, tdown_3 = false, tleft_3 = false, tright_3 = true;
    int location_3 = 0;
    Queue<Point> next_3 = new LinkedList<Point>();
    Point nextStop_3;

    String[] stations_3 = {"Medford", "Alewife", "Melrose", "Stoneham"};
    ArrayList<String> picked_stations_3 = new ArrayList<>();

    HashMap<String, String> sec2sta_3 = new HashMap<>();
    HashMap<String, Integer> visited_3 = new HashMap<>();

    HashMap<String, ArrayList<Point>> sections_3 = new HashMap<>();
    HashMap<String, Integer> speedLimit_3 = new HashMap<>();
    HashMap<String, Point> switches_3 = new HashMap<>();
    String[] route_3;
    String current_3, next_section_3, prev_3;

    final int LEFT_3 = 0, RIGHT_3 = 1, UP_3 = 2, DOWN_3 = 3, CROSS_RIGHT_3 = 4, CROSS_LEFT_3 = 5, CROSS_RIGHT_UP_3 = 6,
            CROSS_LEFT_UP_3 = 7;
    int dir_3 = RIGHT_3;

    int b2r_4 = 1;
    long startTime_4;
    boolean flag_4 = false;
    boolean fileRead_4 = false;

    double posX_4 = 200, posY_4 = 525;
    double speed_4 = 0.0;
    boolean tu_4 = false, tdown_4 = false, tleft_4 = false, tright_4 = true;
    int location_4 = 0;
    Queue<Point> next_4 = new LinkedList<Point>();
    Point nextStop_4;

    String[] stations_4 = {"Medford", "Alewife", "Melrose", "Stoneham", "Reading"};
    ArrayList<String> picked_stations_4 = new ArrayList<>();

    HashMap<String, String> sec2sta_4 = new HashMap<>();
    HashMap<String, Integer> visited_4 = new HashMap<>();

    HashMap<String, ArrayList<Point>> sections_4 = new HashMap<>();
    HashMap<String, Integer> speedLimit_4 = new HashMap<>();
    HashMap<String, Point> switches_4 = new HashMap<>();
    String[] route_4;
    String current_4, next_section_4, prev_4;

    final int LEFT_4 = 0, RIGHT_4 = 1, UP_4 = 2, DOWN_4 = 3, CROSS_RIGHT_4 = 4, CROSS_LEFT_4 = 5, CROSS_RIGHT_UP_4 = 6,
            CROSS_LEFT_UP_4 = 7;
    int dir_4 = RIGHT_4;

    Main() {
        init();
    }

    public void init() {
        init_1();
        init_2();
        init_3();
        init_4();
    }

    public void init_1() {

        b2r_1 = 1;
        flag_1 = false;
        fileRead_1 = false;

        posX_1 = 40;
        posY_1 = 35;
        speed_1 = 0.0;
        tu_1 = tdown_1 = tleft_1 = false;
        tright_1 = true;
        location_1 = 0;
        next_1 = new LinkedList<Point>();
        picked_stations_1 = new ArrayList<>();

        sec2sta_1 = new HashMap<>();
        visited_1 = new HashMap<>();

        sections_1 = new HashMap<>();
        speedLimit_1 = new HashMap<>();
        switches_1 = new HashMap<>();

        Random rand = new Random();
        picked_stations_1.add("Alewife");
        picked_stations_1.add("Medford");
        visited_1.put(picked_stations_1.get(0), 0);
        visited_1.put(picked_stations_1.get(1), 0);
        sec2sta_1.put("S1-1", "Boston");
        sec2sta_1.put("S1-3", "Boston");
        sec2sta_1.put("S10-1", "Medford");
        sec2sta_1.put("S10-2", "Medford");
        sec2sta_1.put("S5-1", "Alewife");
        sec2sta_1.put("S5-2", "Alewife");
        sec2sta_1.put("S19-1", "Melrose");
        sec2sta_1.put("S19-2", "Melrose");
        sec2sta_1.put("S25-1", "Stoneham");
        sec2sta_1.put("S25-2", "Stoneham");
        sec2sta_1.put("S25-3", "Stoneham");
        //sec2sta_1.put("S29-1", "Reading");
        //sec2sta_1.put("S29-2", "Reading");

    }

    public void init_2() {

        b2r_2 = 1;
        flag_2 = false;
        fileRead_2 = false;

        posX_2 = 230;
        posY_2 = 230;
        speed_2 = 0.0;
        tu_2 = tdown_2 = tleft_2 = false;
        tright_2 = true;
        location_2 = 0;
        next_2 = new LinkedList<Point>();
        picked_stations_2 = new ArrayList<>();

        sec2sta_2 = new HashMap<>();
        visited_2 = new HashMap<>();

        sections_2 = new HashMap<>();
        speedLimit_2 = new HashMap<>();
        switches_2 = new HashMap<>();

        Random rand = new Random();
        int id1 = rand.nextInt(stations_2.length);
        picked_stations_2.add("Melrose");
        int id2;
        while ((id2 = rand.nextInt(stations_2.length)) == id1);
        picked_stations_2.add("Stoneham");
        visited_2.put(picked_stations_2.get(0), 0);
        visited_2.put(picked_stations_2.get(1), 0);
        sec2sta_2.put("S1-1", "Boston");
        sec2sta_2.put("S1-3", "Boston");
        sec2sta_2.put("S10-1", "Medford");
        sec2sta_2.put("S10-2", "Medford");
        sec2sta_2.put("S5-1", "Alewife");
        sec2sta_2.put("S5-2", "Alewife");
        sec2sta_2.put("S19-1", "Melrose");
        sec2sta_2.put("S19-2", "Melrose");
        sec2sta_2.put("S25-1", "Stoneham");
        sec2sta_2.put("S25-2", "Stoneham");
        sec2sta_2.put("S25-3", "Stoneham");
        sec2sta_2.put("S29-1", "Reading");
        sec2sta_2.put("S29-2", "Reading");

    }

    public void init_3() {

        b2r_3 = 1;
        flag_3 = false;
        fileRead_3 = false;

        posX_3 = 530;
        posY_3 = 330;
        speed_3 = 0.0;
        tu_3 = tdown_3 = tleft_3 = false;
        tright_3 = true;
        location_3 = 0;
        next_3 = new LinkedList<Point>();
        picked_stations_3 = new ArrayList<>();

        sec2sta_3 = new HashMap<>();
        visited_3 = new HashMap<>();

        sections_3 = new HashMap<>();
        speedLimit_3 = new HashMap<>();
        switches_3 = new HashMap<>();

        Random rand = new Random();
        picked_stations_3.add("Alewife");
        visited_3.put(picked_stations_3.get(0), 0);
        sec2sta_3.put("S1-1", "Boston");
        sec2sta_3.put("S1-3", "Boston");
        sec2sta_3.put("S10-1", "Medford");
        sec2sta_3.put("S10-2", "Medford");
        sec2sta_3.put("S5-1", "Alewife");
        sec2sta_3.put("S5-2", "Alewife");
        sec2sta_3.put("S19-1", "Melrose");
        sec2sta_3.put("S19-2", "Melrose");
        sec2sta_3.put("S25-1", "Stoneham");
        sec2sta_3.put("S25-2", "Stoneham");
        sec2sta_3.put("S25-3", "Stoneham");
        sec2sta_3.put("S29-1", "Reading");
        sec2sta_3.put("S29-2", "Reading");

    }

    public void init_4() {

        b2r_4 = 1;
        flag_4 = false;
        fileRead_4 = false;

        posX_4 = 200;
        posY_4 = 525;
        speed_4 = 0.0;
        tu_4 = tdown_4 = tleft_4 = false;
        tright_4 = true;
        location_4 = 0;
        next_4 = new LinkedList<Point>();
        picked_stations_4 = new ArrayList<>();

        sec2sta_4 = new HashMap<>();
        visited_4 = new HashMap<>();

        sections_4 = new HashMap<>();
        speedLimit_4 = new HashMap<>();
        switches_4 = new HashMap<>();

        Random rand = new Random();
        int id1 = rand.nextInt(stations_4.length);
        picked_stations_4.add(stations_4[id1]);
        int id2;
        while ((id2 = rand.nextInt(stations_4.length)) == id1);
        picked_stations_4.add(stations_4[id2]);
        visited_4.put(picked_stations_4.get(0), 0);
        visited_4.put(picked_stations_4.get(1), 0);
        sec2sta_4.put("S1-1", "Boston");
        sec2sta_4.put("S1-3", "Boston");
        sec2sta_4.put("S10-1", "Medford");
        sec2sta_4.put("S10-2", "Medford");
        sec2sta_4.put("S5-1", "Alewife");
        sec2sta_4.put("S5-2", "Alewife");
        sec2sta_4.put("S19-1", "Melrose");
        sec2sta_4.put("S19-2", "Melrose");
        sec2sta_4.put("S25-1", "Stoneham");
        sec2sta_4.put("S25-2", "Stoneham");
        sec2sta_4.put("S25-3", "Stoneham");
        sec2sta_4.put("S29-1", "Reading");
        sec2sta_4.put("S29-2", "Reading");

    }

    public static void main(String[] args) {

        new Main().go();
    }

    private void go() {

        frame = new JFrame("Train Simulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawPanel = new DrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        //-------------------------
        //-------------------------
        JPanel TABLE = new JPanel();

//        model.setValueAt(value, 1, 1);
        TableModel = new DefaultTableModel(data, column);
        table = new JTable(TableModel);
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
        table.setFillsViewportHeight(true);
        JScrollPane sp = new JScrollPane(table);

        //-------------------------
        //-------------------------
        JPanel BTNS;
        BTNS = new JPanel(new GridLayout(4, 3));
        BTNS.setPreferredSize((new Dimension(50, 20)));
        JLabel trainL_1 = new JLabel("Train Number 1234");
        JButton trainSr_1 = new JButton("Start");
        trainSr_1.setSize(new Dimension(10, 5));

        trainSr_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                start_1();
            }
        });

        JButton trainSo_1 = new JButton("Stop");

        trainSo_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                speed_1 = 0;
            }
        });

        BTNS.add(trainL_1);
        BTNS.add(trainSr_1);
        BTNS.add(trainSo_1);

        JLabel trainL_2 = new JLabel("Train Number 1122");
        JButton trainSr_2 = new JButton("Start");

        trainSr_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                start_2();
            }
        });

        JButton trainSo_2 = new JButton("Stop");

        trainSo_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                speed_2 = 0;
            }
        });

        BTNS.add(trainL_2);
        BTNS.add(trainSr_2);
        BTNS.add(trainSo_2);

        JLabel trainL_3 = new JLabel("Train Number 3344");
        JButton trainSr_3 = new JButton("Start");

        trainSr_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                start_3();
            }
        });

        JButton trainSo_3 = new JButton("Stop");

        trainSo_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                speed_3 = 0;
            }
        });

        BTNS.add(trainL_3);
        BTNS.add(trainSr_3);
        BTNS.add(trainSo_3);

        JLabel trainL_4 = new JLabel("Train Number 5678");
        JButton trainSr_4 = new JButton("Start");

        trainSr_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                start_4();
            }
        });

        JButton trainSo_4 = new JButton("Stop");

        trainSo_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                speed_4 = 0;
            }
        });

        BTNS.add(trainL_4);
        BTNS.add(trainSr_4);
        BTNS.add(trainSo_4);

        TABLE.add(sp);
//        TABLE.add(BTNS);

        JButton Emergency = new JButton("Emergency Stop");
//        Emergency.setPreferredSize(new Dimension(40, 40));
        Emergency.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                stopAll();
                fspeed = 0;

            }
        });

        JButton startAll = new JButton("Start All");
//        Emergency.setPreferredSize(new Dimension(40, 40));
        startAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                start_1();
                start_2();
                start_3();
                start_4();
            }
        });

        JButton Reset = new JButton("RESET");
//        Emergency.setPreferredSize(new Dimension(40, 40));
        Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResetAll();
            }
        });

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());

        jPanel.add(TABLE, BorderLayout.PAGE_START);
        jPanel.add(BTNS, (BorderLayout.CENTER));

        JPanel StartAND_Emergency = new JPanel(new GridLayout(1, 2));

        StartAND_Emergency.add(Emergency);
        StartAND_Emergency.add(startAll);
        StartAND_Emergency.add(Reset);

        jPanel.add(StartAND_Emergency, (BorderLayout.PAGE_END));

        frame.getContentPane().add(BorderLayout.EAST, jPanel);
//      frame.getContentPane().add((BorderLayout.SOUTH), startAll);

        frame.setVisible(true);
        frame.setResizable(true);
        frame.setSize(1150, 750);
        frame.setLocation(0, 0);

        RUN();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(20);
                        frightmoveIt();
                        frame.repaint();
                    } catch (Exception exc) {
                    }
                }
            }
        }).start();
    }
    Thread thread_1, thread_2, thread_3, thread_4;

    public void RUN() {

        moveit = true;
        flag_scheduling = true;

        thread_1 = new Thread(new Runnable() {
            @Override
            public void run() {
                moveIt_1();

            }

            public void stopThread() {
                moveit = false;

            }
        });
        thread_1.start();

        thread_2 = new Thread(new Runnable() {
            @Override
            public void run() {
                moveIt_2();

            }

            public void stopThread() {
                moveit = false;
            }
        });
        thread_2.start();

        thread_3 = new Thread(new Runnable() {
            @Override
            public void run() {
                moveIt_3();
            }

            public void stopThread() {
                moveit = false;

            }
        });
        thread_3.start();

        thread_4 = new Thread(new Runnable() {
            @Override
            public void run() {
                moveIt_4();

            }

            public void stopThread() {
                moveit = false;
            }
        });
        thread_4.start();

    }

    class DrawPanel extends JPanel {

        private BufferedImage train, track, track1, track3, track4, boston, alewife, melrose, medford, stoneham, reading;
        private BufferedImage trackg, track1g, track3g, track4g;
        private BufferedImage trainONE, trainTwo, trainThree, trainFour;

        public DrawPanel() {

            try {
                trainONE = ImageIO.read(new File("one.jpg"));
                trainTwo = ImageIO.read(new File("two_2.png"));
                trainThree = ImageIO.read(new File("three.png"));
                trainFour = ImageIO.read(new File("four.png"));
                train = ImageIO.read(new File("train.jpg"));
                track = ImageIO.read(new File("track.png"));
                track1 = ImageIO.read(new File("track1.png"));
                track3 = ImageIO.read(new File("track3.png"));
                track4 = ImageIO.read(new File("track4.png"));
                trackg = ImageIO.read(new File("trackg.png"));
                track1g = ImageIO.read(new File("track1g.png"));
                track3g = ImageIO.read(new File("track3g.png"));
                track4g = ImageIO.read(new File("track4g.png"));
                boston = ImageIO.read(new File("boston.png"));
                alewife = ImageIO.read(new File("alewife.png"));
                melrose = ImageIO.read(new File("melrose.png"));
                medford = ImageIO.read(new File("medford.png"));
                stoneham = ImageIO.read(new File("stoneham.png"));
                reading = ImageIO.read(new File("reading.png"));
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("here");
            }
        }

        public void paintComponent(Graphics g) {

            g.setColor(Color.BLUE);
            g.fillRect(0, 0, this.getWidth(),
                    this.getHeight());
            g.setColor(Color.RED);
            g.fillRect(3, 3,
                    this.getWidth() - 6, this.getHeight() - 6);

            g.setColor(Color.WHITE);
            g.fillRect(6, 6, this.getWidth() - 12, this.getHeight() - 12);
            /*
			 * g.setColor(Color.BLACK); g.fillRect(oneX, oneY, 6, 6);
             */
            // draw lines
            g.setColor(Color.BLACK);
            // ok
            g.drawImage(track, 40, 40, 80, 20, this);	// 1-1
            g.drawImage(track, 120, 40, 80, 20, this);	// 1-1
            g.drawImage(track, 200, 40, 80, 20, this);	// 2-1
            g.drawImage(track, 280, 40, 80, 20, this);	// 3-1
            g.drawImage(track, 360, 40, 80, 20, this);	// 3-1
            g.drawImage(track, 440, 40, 80, 20, this);	// 4-1
            g.drawImage(track, 520, 40, 80, 20, this);	// 5-1
            g.drawImage(track, 600, 40, 60, 20, this);	// 6-1
            // ok
            g.drawImage(track, 40, 90, 80, 20, this);	// 1-2
            g.drawImage(track, 120, 90, 80, 20, this);	// 1-2

            g.drawImage(track, 40, 680, 80, 20, this);
            g.drawImage(track, 120, 680, 80, 20, this);
            g.drawImage(track, 200, 680, 80, 20, this);
            g.drawImage(track, 280, 680, 80, 20, this);
            g.drawImage(track, 360, 680, 80, 20, this);
            g.drawImage(track, 440, 680, 80, 20, this);
            g.drawImage(track, 520, 680, 80, 20, this);
            g.drawImage(track, 600, 680, 60, 20, this);

            // ok
            g.drawImage(track, 40, 145, 80, 20, this);	// 1-3
            g.drawImage(track, 120, 145, 80, 20, this);
            g.drawImage(track, 200, 145, 80, 20, this);
            g.drawImage(track, 280, 145, 20, 20, this);
            // ok
            g.drawImage(track, 350, 90, 80, 20, this);
            g.drawImage(track, 430, 90, 80, 20, this);
            g.drawImage(track, 510, 90, 80, 20, this);
            g.drawImage(track, 580, 90, 50, 20, this);
            // ok
            g.drawImage(track, 395, 290, 80, 20, this);
            g.drawImage(track, 475, 290, 80, 20, this);
            g.drawImage(track, 555, 290, 95, 20, this);
            // ok
            g.drawImage(track, 40, 200, 80, 20, this);
            g.drawImage(track, 120, 200, 80, 20, this);

            // ok
            g.drawImage(track, 40, 240, 80, 20, this);	// 250
            g.drawImage(track, 120, 240, 80, 20, this);
            g.drawImage(track, 200, 240, 80, 20, this);
            g.drawImage(track, 280, 240, 80, 20, this);
            g.drawImage(track, 360, 240, 80, 20, this);
            g.drawImage(track, 440, 240, 80, 20, this);
            g.drawImage(track, 520, 240, 80, 20, this);
            g.drawImage(track, 600, 240, 60, 20, this);
            // ok
            g.drawImage(track, 40, 345, 80, 20, this);
            g.drawImage(track, 120, 345, 80, 20, this);
            g.drawImage(track, 200, 345, 80, 20, this);
            g.drawImage(track, 280, 345, 80, 20, this);
            g.drawImage(track, 360, 345, 80, 20, this);
            g.drawImage(track, 440, 345, 80, 20, this);
            g.drawImage(track, 520, 345, 100, 20, this);

            // ok
            g.drawImage(track, 400, 190, 75, 20, this);	// 8-1
            g.drawImage(track, 475, 190, 75, 20, this);	// 8-1

            // ok
            g.drawImage(track, 100, 290, 75, 20, this);
            g.drawImage(track, 175, 290, 75, 20, this);
            // 
            g.drawImage(track, 400, 395, 80, 20, this);
            g.drawImage(track, 480, 395, 70, 20, this);
            // ok
            g.drawImage(track, 30, 395, 70, 20, this);
            g.drawImage(track, 100, 395, 70, 20, this);
            g.drawImage(track, 170, 395, 70, 20, this);
            g.drawImage(track, 240, 395, 60, 20, this);
            // ok
            g.drawImage(track, 80, 495, 80, 20, this);
            g.drawImage(track, 160, 495, 80, 20, this);
            g.drawImage(track, 240, 495, 80, 20, this);
            g.drawImage(track, 320, 495, 80, 20, this);
            g.drawImage(track, 400, 495, 80, 20, this);
            g.drawImage(track, 480, 495, 60, 20, this);
            g.drawImage(track, 540, 495, 95, 20, this);
            // ok
            g.drawImage(track, 450, 440, 100, 20, this);
            // ok
            g.drawImage(track, 50, 540, 80, 20, this);
            g.drawImage(track, 130, 540, 80, 20, this);
            g.drawImage(track, 210, 540, 90, 20, this);
            // ok
            g.drawImage(track, 50, 630, 80, 20, this);
            g.drawImage(track, 130, 630, 80, 20, this);
            g.drawImage(track, 210, 630, 80, 20, this);
            g.drawImage(track, 280, 630, 80, 20, this);
            g.drawImage(track, 350, 630, 80, 20, this);
            g.drawImage(track, 430, 630, 80, 20, this);
            g.drawImage(track, 510, 630, 90, 20, this);
            // ok
            g.drawImage(track, 100, 585, 75, 20, this);
            g.drawImage(track, 175, 585, 75, 20, this);
            // ok
            g.drawImage(track, 500, 660, 100, 20, this);
            // ok
            g.drawImage(track1, 615, 105, 20, 80, this);	// 6-2
            // ok
            g.drawImage(track1, 645, 55, 20, 80, this);		// 6-1
            g.drawImage(track1, 645, 120, 20, 80, this);	// 6-1
            g.drawImage(track1, 645, 200, 20, 50, this);	// 7-1
            // ok
            g.drawImage(track1, 35, 250, 20, 100, this);	// 11-1
            // ok

            g.drawImage(track1, 645, 295, 20, 80, this);
            g.drawImage(track1, 645, 375, 20, 80, this);
            g.drawImage(track1, 645, 455, 20, 80, this);
            g.drawImage(track1, 645, 535, 20, 80, this);
            g.drawImage(track1, 645, 615, 20, 70, this);
            // ok
            g.drawImage(track1, 30, 400, 20, 80, this);
            g.drawImage(track1, 30, 480, 20, 80, this);
            g.drawImage(track1, 30, 540, 20, 80, this);
            g.drawImage(track1, 30, 620, 20, 70, this);
            // ok
            g.drawImage(track1, 620, 350, 20, 80, this);
            g.drawImage(track1, 620, 430, 20, 80, this);
            // ok
            g.drawImage(track1, 45, 550, 20, 90, this);

            // ok
            g.drawImage(track3, 200, 85, 10, 20, this);
            g.drawImage(track3, 205, 80, 10, 20, this);
            g.drawImage(track3, 210, 75, 10, 20, this);
            g.drawImage(track3, 215, 70, 10, 20, this);
            g.drawImage(track3, 220, 65, 10, 20, this);
            g.drawImage(track3, 225, 60, 10, 20, this);
            g.drawImage(track3, 230, 55, 10, 20, this);
            g.drawImage(track3, 235, 50, 10, 20, this);
            // ok
            g.drawImage(track3, 200, 195, 10, 20, this);
            g.drawImage(track3, 205, 190, 10, 20, this);
            g.drawImage(track3, 210, 185, 10, 20, this);
            g.drawImage(track3, 215, 180, 10, 20, this);
            g.drawImage(track3, 220, 175, 10, 20, this);
            g.drawImage(track3, 225, 170, 10, 20, this);
            g.drawImage(track3, 230, 165, 10, 20, this);
            g.drawImage(track3, 235, 160, 10, 20, this);
            g.drawImage(track3, 240, 155, 10, 20, this);
            g.drawImage(track3, 245, 150, 10, 20, this);
            // ok
            g.drawImage(track3, 300, 140, 10, 20, this);
            g.drawImage(track3, 305, 135, 10, 20, this);
            g.drawImage(track3, 310, 130, 10, 20, this);
            g.drawImage(track3, 315, 125, 10, 20, this);
            g.drawImage(track3, 320, 120, 10, 20, this);
            g.drawImage(track3, 325, 115, 10, 20, this);
            g.drawImage(track3, 330, 110, 10, 20, this);
            g.drawImage(track3, 335, 105, 10, 20, this);
            g.drawImage(track3, 340, 100, 10, 20, this);
            // ok
            g.drawImage(track3, 355, 235, 10, 20, this);	// 8-1
            g.drawImage(track3, 360, 230, 10, 20, this);
            g.drawImage(track3, 365, 225, 10, 20, this);
            g.drawImage(track3, 370, 220, 10, 20, this);
            g.drawImage(track3, 375, 215, 10, 20, this);
            g.drawImage(track3, 380, 210, 10, 20, this);
            g.drawImage(track3, 385, 205, 10, 20, this);
            g.drawImage(track3, 390, 200, 10, 20, this);
            // ok
            g.drawImage(track3, 250, 285, 10, 20, this);	// 10-2
            g.drawImage(track3, 255, 280, 10, 20, this);
            g.drawImage(track3, 260, 275, 10, 20, this);
            g.drawImage(track3, 265, 270, 10, 20, this);
            g.drawImage(track3, 270, 265, 10, 20, this);
            g.drawImage(track3, 275, 260, 10, 20, this);
            g.drawImage(track3, 280, 255, 10, 20, this);
            g.drawImage(track3, 285, 250, 10, 20, this);
            // ok
            g.drawImage(track3, 350, 340, 10, 20, this);
            g.drawImage(track3, 355, 335, 10, 20, this);
            g.drawImage(track3, 360, 330, 10, 20, this);
            g.drawImage(track3, 365, 325, 10, 20, this);
            g.drawImage(track3, 370, 320, 10, 20, this);
            g.drawImage(track3, 375, 315, 10, 20, this);
            g.drawImage(track3, 380, 310, 10, 20, this);
            g.drawImage(track3, 385, 305, 10, 20, this);
            g.drawImage(track3, 390, 300, 10, 20, this);
            g.drawImage(track3, 395, 295, 10, 20, this);
            // ok
            g.drawImage(track3, 553, 390, 10, 20, this);	// 19-2
            g.drawImage(track3, 556, 385, 10, 20, this);
            g.drawImage(track3, 559, 380, 10, 20, this);
            g.drawImage(track3, 562, 375, 10, 20, this);
            g.drawImage(track3, 565, 370, 10, 20, this);
            g.drawImage(track3, 568, 365, 10, 20, this);
            g.drawImage(track3, 571, 360, 10, 20, this);
            g.drawImage(track3, 574, 355, 10, 20, this);
            g.drawImage(track3, 577, 350, 10, 20, this);
            // ok
            g.drawImage(track3, 300, 390, 10, 20, this);
            g.drawImage(track3, 305, 385, 10, 20, this);
            g.drawImage(track3, 310, 380, 10, 20, this);
            g.drawImage(track3, 315, 375, 10, 20, this);
            g.drawImage(track3, 320, 370, 10, 20, this);
            g.drawImage(track3, 325, 365, 10, 20, this);
            g.drawImage(track3, 330, 360, 10, 20, this);
            g.drawImage(track3, 335, 355, 10, 20, this);
            g.drawImage(track3, 340, 350, 10, 20, this);
            // ok
            g.drawImage(track3, 400, 490, 10, 20, this);	// 22-1
            g.drawImage(track3, 405, 485, 10, 20, this);
            g.drawImage(track3, 410, 480, 10, 20, this);
            g.drawImage(track3, 415, 475, 10, 20, this);
            g.drawImage(track3, 420, 470, 10, 20, this);
            g.drawImage(track3, 425, 465, 10, 20, this);
            g.drawImage(track3, 430, 460, 10, 20, this);
            g.drawImage(track3, 435, 455, 10, 20, this);
            g.drawImage(track3, 440, 450, 10, 20, this);
            // ok
            g.drawImage(track3, 300, 540, 10, 20, this);	// 24-1
            g.drawImage(track3, 305, 535, 10, 20, this);
            g.drawImage(track3, 310, 530, 10, 20, this);
            g.drawImage(track3, 315, 525, 10, 20, this);
            g.drawImage(track3, 320, 520, 10, 20, this);
            g.drawImage(track3, 325, 515, 10, 20, this);
            g.drawImage(track3, 330, 510, 10, 20, this);
            g.drawImage(track3, 335, 505, 10, 20, this);
            g.drawImage(track3, 340, 500, 10, 20, this);
            // ok
            g.drawImage(track3, 250, 580, 10, 20, this);	// 25-3
            g.drawImage(track3, 255, 575, 10, 20, this);
            g.drawImage(track3, 260, 570, 10, 20, this);
            g.drawImage(track3, 265, 565, 10, 20, this);
            g.drawImage(track3, 270, 560, 10, 20, this);
            g.drawImage(track3, 275, 555, 10, 20, this);
            g.drawImage(track3, 280, 550, 10, 20, this);
            // ok
            g.drawImage(track3, 405, 85, 10, 20, this);
            g.drawImage(track3, 410, 80, 10, 20, this);
            g.drawImage(track3, 415, 75, 10, 20, this);
            g.drawImage(track3, 420, 70, 10, 20, this);
            g.drawImage(track3, 425, 65, 10, 20, this);
            g.drawImage(track3, 430, 60, 10, 20, this);
            g.drawImage(track3, 435, 55, 10, 20, this);
            g.drawImage(track3, 440, 50, 10, 20, this);
            // ok
            g.drawImage(track3, 505, 85, 10, 20, this);
            g.drawImage(track3, 510, 80, 10, 20, this);
            g.drawImage(track3, 515, 75, 10, 20, this);
            g.drawImage(track3, 520, 70, 10, 20, this);
            g.drawImage(track3, 525, 65, 10, 20, this);
            g.drawImage(track3, 530, 60, 10, 20, this);
            g.drawImage(track3, 535, 55, 10, 20, this);
            g.drawImage(track3, 540, 50, 10, 20, this);

            // ok
            g.drawImage(track4, 625, 175, 10, 20, this);	// 6-2
            g.drawImage(track4, 630, 180, 10, 20, this);
            g.drawImage(track4, 635, 185, 10, 20, this);
            g.drawImage(track4, 640, 190, 10, 20, this);
            g.drawImage(track4, 645, 195, 10, 20, this);
            // ok
            g.drawImage(track4, 405, 50, 10, 20, this);
            g.drawImage(track4, 410, 55, 10, 20, this);
            g.drawImage(track4, 415, 60, 10, 20, this);
            g.drawImage(track4, 420, 65, 10, 20, this);
            g.drawImage(track4, 425, 70, 10, 20, this);
            g.drawImage(track4, 430, 75, 10, 20, this);
            g.drawImage(track4, 435, 80, 10, 20, this);
            g.drawImage(track4, 440, 85, 10, 20, this);
            // ok
            g.drawImage(track4, 505, 50, 10, 20, this);
            g.drawImage(track4, 510, 55, 10, 20, this);
            g.drawImage(track4, 515, 60, 10, 20, this);
            g.drawImage(track4, 520, 65, 10, 20, this);
            g.drawImage(track4, 525, 70, 10, 20, this);
            g.drawImage(track4, 530, 75, 10, 20, this);
            g.drawImage(track4, 535, 80, 10, 20, this);
            g.drawImage(track4, 540, 85, 10, 20, this);
            // ok
            g.drawImage(track4, 550, 195, 10, 20, this);	// 8-1
            g.drawImage(track4, 555, 200, 10, 20, this);
            g.drawImage(track4, 560, 205, 10, 20, this);
            g.drawImage(track4, 565, 210, 10, 20, this);
            g.drawImage(track4, 570, 215, 10, 20, this);
            g.drawImage(track4, 575, 220, 10, 20, this);
            g.drawImage(track4, 580, 225, 10, 20, this);
            g.drawImage(track4, 585, 230, 10, 20, this);
            g.drawImage(track4, 590, 235, 10, 20, this);
            // ok
            g.drawImage(track4, 550, 445, 10, 20, this);	// 22-1
            g.drawImage(track4, 555, 450, 10, 20, this);
            g.drawImage(track4, 560, 455, 10, 20, this);
            g.drawImage(track4, 565, 460, 10, 20, this);
            g.drawImage(track4, 570, 465, 10, 20, this);
            g.drawImage(track4, 575, 470, 10, 20, this);
            g.drawImage(track4, 580, 475, 10, 20, this);
            g.drawImage(track4, 585, 480, 10, 20, this);
            g.drawImage(track4, 590, 485, 10, 20, this);
            // ok
            g.drawImage(track4, 480, 640, 10, 20, this);	// 29-2
            g.drawImage(track4, 485, 645, 10, 20, this);
            g.drawImage(track4, 490, 650, 10, 20, this);
            g.drawImage(track4, 495, 655, 10, 20, this);
            // ok
            g.drawImage(track4, 60, 250, 10, 20, this);	// 10-2
            g.drawImage(track4, 65, 255, 10, 20, this);
            g.drawImage(track4, 70, 260, 10, 20, this);
            g.drawImage(track4, 75, 265, 10, 20, this);
            g.drawImage(track4, 80, 270, 10, 20, this);
            g.drawImage(track4, 85, 275, 10, 20, this);
            g.drawImage(track4, 90, 280, 10, 20, this);
            g.drawImage(track4, 95, 285, 10, 20, this);
            // ok
            g.drawImage(track4, 370, 350, 10, 20, this);	// 19-2
            g.drawImage(track4, 373, 355, 10, 20, this);
            g.drawImage(track4, 376, 360, 10, 20, this);
            g.drawImage(track4, 379, 365, 10, 20, this);
            g.drawImage(track4, 382, 370, 10, 20, this);
            g.drawImage(track4, 385, 375, 10, 20, this);
            g.drawImage(track4, 388, 380, 10, 20, this);
            g.drawImage(track4, 391, 385, 10, 20, this);
            // ok
            g.drawImage(track4, 80, 550, 10, 20, this);	// 25-3
            g.drawImage(track4, 83, 555, 10, 20, this);
            g.drawImage(track4, 86, 560, 10, 20, this);
            g.drawImage(track4, 89, 565, 10, 20, this);
            g.drawImage(track4, 92, 570, 10, 20, this);
            g.drawImage(track4, 95, 575, 10, 20, this);
            // ok

            helperClass hp = new helperClass();
            hp.UpdateGraphic(current_1, g, trackg, track1g, track3g, track4g, this);
            hp.UpdateGraphic(current_2, g, trackg, track1g, track3g, track4g, this);
            hp.UpdateGraphic(current_3, g, trackg, track1g, track3g, track4g, this);
            hp.UpdateGraphic(current_4, g, trackg, track1g, track3g, track4g, this);

            g.setColor(Color.RED);

            g.drawImage(boston, 40, 70, this);
            g.drawImage(boston, 40, 170, this);

            g.drawImage(alewife, 570, 70, this);
            g.drawImage(medford, 130, 260, this);
            g.drawImage(melrose, 440, 370, this);
            g.drawImage(stoneham, 130, 510, this);
            g.drawImage(stoneham, 130, 560, this);
            g.drawImage(reading, 510, 648, this);

            // train image  develop 
            //g.drawImage(train, freightX, freightY, this);
            // Train 1 -
            g.drawImage(trainONE, (int) posX_1 + 1, (int) posY_1 - 15, this);
            g.drawImage(train, (int) posX_1, (int) posY_1, this);
            // Train 2 - train right to medford
            g.drawImage(trainTwo, (int) posX_2 + 1, (int) posY_2 - 15, this);
            g.drawImage(train, (int) posX_2, (int) posY_2, this);
            // Train 3 -train right to melrose
            g.drawImage(trainThree, (int) posX_3 + 1, (int) posY_3 - 15, this);
            g.drawImage(train, (int) posX_3, (int) posY_3, this);
            // Train 4 -train right to last line
            g.drawImage(trainFour, (int) posX_4 + 1, (int) posY_4 - 15, this);
            g.drawImage(train, (int) posX_4, (int) posY_4, this);

            // if (fright || fleft) {
//                g.fillRect(freightX, freightY, 30, 30);
//            } else if (fup || fdown) {
//                g.fillRect(freightX, freightY, 30, 30);
//            }
        }
    }

    private void readTrackdb_1() {
        try {
            File file = new File("trackdb.txt");
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] tokens = line.trim().split(" ");
                if (tokens[0].contains("SW")) {
                    String[] vals = tokens[1].trim().split(",");
                    int x = Integer.valueOf(vals[0]);
                    int y = Integer.valueOf(vals[1]);
                    Point p = new Point(x, y);
                    switches_1.put(tokens[0], p);
                } else {
                    String[] vals = tokens[1].trim().split(";");
                    ArrayList<Point> points = new ArrayList<>();
                    for (int i = 0; i < vals.length; ++i) {
                        String[] vals2 = vals[i].trim().split(",");
                        int x = Integer.valueOf(vals2[0]);
                        int y = Integer.valueOf(vals2[1]);
                        Point p = new Point(x, y);
                        points.add(p);
                    }
                    int speed = Integer.valueOf(tokens[2].trim());
                    sections_1.put(tokens[0], points);
                    speedLimit_1.put(tokens[0], speed);
                }
            }
            in.close();
            in = new Scanner(new File("route2.txt"));
            while (in.hasNextLine()) {
                route_1 = in.nextLine().trim().split(" ");
            }
            in.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        prev_1 = null;
    }

    private void updateNext_1() {
        String key;
        if (b2r_1 == 1) {
            /*if (location + 1 < route.length && picked_stations.contains(sec2sta.get(route[location+1])) && visited.get(sec2sta.get(route[location+1])) == 0) {
				speed = 0;
				flag = true;
				startTime = System.currentTimeMillis();
				visited.put(sec2sta.get(route[location+1]), 1);
				System.out.println("Waiting at station: " + sec2sta.get(route[location+1]));
				return;
				long time = System.currentTimeMillis();
				while(System.currentTimeMillis() - time <= 2000);
			}*/
            location_1++;
            if (location_1 >= route_1.length) {
                speed_1 = 0;
                b2r_1 = 0;
                prev_1 = null;
                return;
            }
            key = route_1[location_1];
            prev_1 = current_1;
            current_1 = key;
            speed_1 = speedLimit_1.get(current_1) / 100.0;
            if (location_1 + 1 < route_1.length) {
                next_section_1 = route_1[location_1 + 1];
            } else {
                next_section_1 = key;
            }
        } else {
            location_1--;
            if (location_1 < 0) {
                speed_1 = 0;
                b2r_1 = 1;
                prev_1 = null;
                return;
            }
            key = route_1[location_1];
            prev_1 = current_1;
            current_1 = key;
            speed_1 = speedLimit_1.get(current_1) / 100.0;
            if (location_1 - 1 >= 0) {
                next_section_1 = route_1[location_1 - 1];
            } else {
                next_section_1 = key;
            }
        }

        ArrayList<Point> tempPoints = sections_1.get(key);
        for (int i = 0; i < tempPoints.size(); ++i) {
            if (b2r_1 == 1) {
                next_1.add(tempPoints.get(i));
            } else {
                next_1.add(tempPoints.get(tempPoints.size() - i - 1));
            }
        }
        //System.out.println("Inside update: " + current + " " + next_section);
    }

    private void updateDir_1() {

        if (current_1.equals("S2-1")) {
            if (prev_1.equals("S1-1")) {
                dir_1 = RIGHT_1;
            } else if (prev_1.equals("S3-1")) {
                dir_1 = LEFT_1;
            }
        } else if (current_1.equals("S3-1")) {
            if (prev_1.equals("S2-1")) {
                dir_1 = RIGHT_1;
            } else if (prev_1.equals("S4-2")) {
                dir_1 = CROSS_LEFT_UP_1;
                if (posY_1 <= 50) {
                    dir_1 = LEFT_1;
                }
            } else if (prev_1.equals("S4-1")) {
                dir_1 = LEFT_1;
            }
        } else if (current_1.equals("S4-1")) {
            if (prev_1.equals("S3-1")) {
                dir_1 = RIGHT_1;
            } else if (prev_1.equals("S5-2")) {
                dir_1 = CROSS_LEFT_UP_1;
                if (posY_1 <= 50) {
                    dir_1 = LEFT_1;
                }
            } else if (prev_1.equals("S5-1")) {
                dir_1 = LEFT_1;
            }
        } else if (current_1.equals("S4-2")) {
            if (prev_1.equals("S3-1")) {
                dir_1 = CROSS_RIGHT_1;
                if (posX_1 >= 450 || posY_1 >= 100) {
                    dir_1 = RIGHT_1;
                }
            } else if (prev_1.equals("S6-2")) {
                dir_1 = LEFT_1;
            } else if (prev_1.equals("S3-2")) {
                dir_1 = RIGHT_1;
            }
        } else if (current_1.equals("S5-1")) {
            if (prev_1.equals("S4-1")) {
                dir_1 = RIGHT_1;
            } else if (prev_1.equals("S6-1")) {
                dir_1 = LEFT_1;
            } else if (prev_1.equals("S4-2")) {
                dir_1 = CROSS_RIGHT_UP_1;
                if (posY_1 <= 50) {
                    dir_1 = RIGHT_1;
                }

            }
        } else if (current_1.equals("S5-2")) {
            if (prev_1.equals("S4-1")) {
                dir_1 = CROSS_RIGHT_1;
                if (posX_1 >= 550 || posY_1 >= 100) {
                    dir_1 = RIGHT_1;
                }
            } else if (prev_1.equals("S6-2")) {
                dir_1 = LEFT_1;
            } else if (prev_1.equals("S4-2")) {
                dir_1 = RIGHT_1;
            }
        } else if (current_1.equals("S6-1")) {
            if (prev_1.equals("S5-1")) {
                dir_1 = RIGHT_1;
                if (posX_1 >= 650) {
                    dir_1 = DOWN_1;
                }
            } else if (prev_1.equals("S7-1")) {
                dir_1 = UP_1;
                if (posY_1 <= 45) {
                    dir_1 = LEFT_1;
                }
            }
        } else if (current_1.equals("S6-2")) {
            if (prev_1.equals("S5-2")) {
                dir_1 = DOWN_1;
                if (posX_1 >= 620 && posY_1 >= 180) {
                    dir_1 = CROSS_RIGHT_1;
                }
            } else if (prev_1.equals("S7-1")) {
                dir_1 = CROSS_LEFT_UP_1;
                if (posX_1 <= 620 || posY_1 <= 180) {
                    dir_1 = UP_1;
                }
            }
        } else if (current_1.equals("S7-1")) {
            if (prev_1.equals("S6-1") || prev_1.equals("S6-2")) {
                dir_1 = DOWN_1;
                if (posY_1 >= 250) {
                    dir_1 = LEFT_1;
                }
            } else if (prev_1.equals("S8-1") || prev_1.equals("S8-2")) {
                dir_1 = RIGHT_1;
                if (posX_1 >= 640) {
                    dir_1 = UP_1;
                }
            }
        } else if (current_1.equals("S8-1")) {
            if (prev_1.equals("S7-1")) {
                dir_1 = CROSS_LEFT_UP_1;
                if (posY_1 <= 200 || posX_1 <= 550) {
                    dir_1 = LEFT_1;
                }
                if (posX_1 <= 400) {
                    dir_1 = CROSS_LEFT_1;
                }
            } else if (prev_1.equals("S9-1")) {
                dir_1 = CROSS_RIGHT_UP_1;
                if (posY_1 <= 200 || posX_1 >= 400) {
                    dir_1 = RIGHT_1;
                }
                if (posX_1 >= 550) {
                    dir_1 = CROSS_RIGHT_1;
                }
            }

        } else if (current_1.equals("S8-2")) {
            if (prev_1.equals("S7-1")) {
                dir_1 = LEFT_1;
            } else if (prev_1.equals("S9-1")) {
                dir_1 = RIGHT_1;
            }
        } else if (current_1.equals("S9-1")) {
            if (prev_1.equals("S8-1") || prev_1.equals("S8-2")) {
                dir_1 = LEFT_1;
            } else if (prev_1.equals("S10-1") || prev_1.equals("S10-2")) {
                dir_1 = RIGHT_1;
            }
        } else if (current_1.equals("S10-1")) {
            if (prev_1.equals("S9-1")) {
                dir_1 = LEFT_1;
            } else if (prev_1.equals("S11-1")) {
                dir_1 = RIGHT_1;
            }
        } else if (current_1.equals("S10-2")) {
            if (prev_1.equals("S9-1")) {
                dir_1 = CROSS_LEFT_1;
                if (posY_1 >= 300 || posX_1 <= 250) {
                    dir_1 = LEFT_1;
                }
                if (posX_1 <= 100) {
                    dir_1 = CROSS_LEFT_UP_1;
                }
            } else if (prev_1.equals("S11-1")) {
                dir_1 = CROSS_RIGHT_1;
                if (posY_1 >= 300 || posX_1 >= 100) {
                    dir_1 = RIGHT_1;
                }
                if (posX_1 >= 250) {
                    dir_1 = CROSS_RIGHT_UP_1;
                }
            }
        } else if (current_1.equals("S11-1")) {
            if (prev_1.equals("S10-1") || prev_1.equals("S10-2")) {
                dir_1 = LEFT_1;
                if (posX_1 <= 40) {
                    dir_1 = DOWN_1;
                }
            } else if (prev_1.equals("S12-1")) {
                dir_1 = UP_1;
                if (posY_1 <= 250) {
                    dir_1 = RIGHT_1;
                }
            }
        } else if (current_1.equals("S12-1")) {
            if (prev_1.equals("S11-1")) {
                dir_1 = RIGHT_1;
            } else if (prev_1.equals("S18-1")) {
                dir_1 = LEFT_1;
            }
        } else if (current_1.equals("S13-1")) {
            if (prev_1.equals("S12-1") || prev_1.equals("S14-1")) {
                dir_1 = CROSS_RIGHT_1;
                if (posX_1 >= 400 || posY_1 <= 300) {
                    dir_1 = RIGHT_1;
                }
            }
        } else if (current_1.equals("S16-1")) {
            if (prev_1.equals("S17-1")) {
                dir_1 = DOWN_1;
                if (posY_1 >= 650) {
                    dir_1 = LEFT_1;
                }
                if (posX_1 <= 40) {
                    dir_1 = UP_1;
                }
            }
        } else if (current_1.equals("S17-1")) {
            if (prev_1.equals("S13-1")) {
                dir_1 = RIGHT_1;
                if (posX_1 >= 650) {
                    dir_1 = DOWN_1;
                }
            }
        } else if (current_1.equals("S18-1")) {
            if (prev_1.equals("S12-1") || prev_1.equals("S13-1") || prev_1.equals("S14-1")) {
                dir_1 = RIGHT_1;
            } else if (prev_1.equals("S19-1") || prev_1.equals("S19-2")) {
                dir_1 = LEFT_1;
            }
        } else if (current_1.equals("S19-1")) {
            if (prev_1.equals("S18-1")) {
                dir_1 = RIGHT_1;
            } else if (prev_1.equals("S20-1")) {
                dir_1 = LEFT_1;
            }
        } else if (current_1.equals("S19-2")) {
            if (prev_1.equals("S18-1")) {
                dir_1 = CROSS_RIGHT_1;
                if (posX_1 >= 400 || posY_1 >= 400) {
                    dir_1 = RIGHT_1;
                }
                if (posX_1 >= 500) {
                    dir_1 = CROSS_RIGHT_UP_1;
                }
            }
            if (prev_1.equals("S20-1")) {
                dir_1 = CROSS_LEFT_1;
                if (posX_1 <= 550 || posY_1 >= 400) {
                    dir_1 = LEFT_1;
                }
                if (posX_1 <= 400) {
                    dir_1 = CROSS_LEFT_UP_1;
                }
            }
        } else if (current_1.equals("S20-1")) {
            if (prev_1.equals("S19-1")) {
                dir_1 = RIGHT_1;
                if (posX_1 >= 620) {
                    dir_1 = DOWN_1;
                }
            } else if (prev_1.equals("S19-2")) {
                dir_1 = CROSS_RIGHT_UP_1;
                if (posY_1 <= 350) {
                    dir_1 = RIGHT_1;
                }
                if (posX_1 >= 620) {
                    dir_1 = DOWN_1;
                }
            } else if (prev_1.equals("S21-1")) {
                dir_1 = UP_1;
                if (posY_1 <= 350) {
                    dir_1 = LEFT_1;
                }
            }
        } else if (current_1.equals("S21-1")) {
            if (prev_1.equals("S20-1")) {
                dir_1 = DOWN_1;
                if (posY_1 >= 470) {
                    dir_1 = LEFT_1;
                }
            } else if (prev_1.equals("S22-1") || prev_1.equals("S22-2")) {
                dir_1 = RIGHT_1;
                if (posX_1 >= 600) {
                    dir_1 = UP_1;
                }
            }
        } else if (current_1.equals("S22-1")) {
            if (prev_1.equals("S21-1")) {
                dir_1 = CROSS_LEFT_UP_1;
                if (posX_1 <= 550 || posY_1 <= 420) {
                    dir_1 = LEFT_1;
                }
                if (posX_1 <= 450) {
                    dir_1 = CROSS_LEFT_1;
                }
            } else if (prev_1.equals("S23-1")) {
                dir_1 = CROSS_RIGHT_UP_1;
                if (posX_1 >= 450 || posY_1 <= 420) {
                    dir_1 = RIGHT_1;
                }
                if (posX_1 >= 550) {
                    dir_1 = CROSS_RIGHT_1;
                }
            }
        } else if (current_1.equals("S22-2")) {
            if (prev_1.equals("S21-1")) {
                dir_1 = LEFT_1;
            } else if (prev_1.equals("S23-1")) {
                dir_1 = RIGHT_1;
            }
        } else if (current_1.equals("S23-1")) {
            if (prev_1.equals("S22-1") || prev_1.equals("S22-2")) {
                dir_1 = LEFT_1;
            } else if (prev_1.equals("S24-1") || prev_1.equals("S25-1")) {
                dir_1 = RIGHT_1;
            }
        } else if (current_1.equals("S24-1")) {
            if (prev_1.equals("S23-1")) {
                dir_1 = CROSS_LEFT_1;
                if (posX_1 <= 300 || posY_1 >= 520) {
                    dir_1 = LEFT_1;
                }
            } else if (prev_1.equals("S25-2") || prev_1.equals("S25-3")) {
                dir_1 = RIGHT_1;
                if (posX_1 >= 300) {
                    dir_1 = CROSS_RIGHT_UP_1;
                }
            }
        } else if (current_1.equals("S25-1")) {
            if (prev_1.equals("S23-1")) {
                dir_1 = LEFT_1;
            }
        } else if (current_1.equals("S25-2")) {
            if (prev_1.equals("S24-1")) {
                dir_1 = LEFT_1;
            } else if (prev_1.equals("S26-1")) {
                dir_1 = RIGHT_1;
            }
        } else if (current_1.equals("S25-3")) {
            if (prev_1.equals("S24-1")) {
                dir_1 = CROSS_LEFT_1;
                if (posX_1 <= 250 || posY_1 >= 550) {
                    dir_1 = LEFT_1;
                }
                if (posX_1 <= 100) {
                    dir_1 = CROSS_LEFT_UP_1;
                }
            } else if (prev_1.equals("S26-1")) {
                dir_1 = CROSS_RIGHT_1;
                if (posX_1 >= 100 || posY_1 >= 550) {
                    dir_1 = RIGHT_1;
                }
                if (posX_1 >= 250) {
                    dir_1 = CROSS_RIGHT_UP_1;
                }
            }
        } else if (current_1.equals("S26-1")) {
            if (prev_1.equals("S25-2") || prev_1.equals("S25-3")) {
                dir_1 = LEFT_1;
                if (posX_1 <= 50 || posY_1 >= 550) {
                    dir_1 = DOWN_1;
                }
                if (posY_1 >= 650) {
                    dir_1 = RIGHT_1;
                }
            } else if (prev_1.equals("S27-1")) {
                dir_1 = LEFT_1;
                if (posX_1 <= 50 && posY_1 > 520) {
                    dir_1 = UP_1;
                }
                if (posY_1 <= 520) {
                    dir_1 = RIGHT_1;
                }
            }
        } else if (current_1.equals("S27-1")) {
            if (prev_1.equals("S26-1")) {
                dir_1 = RIGHT_1;
            } else if (prev_1.equals("S28-1")) {
                dir_1 = LEFT_1;
            }
        } else if (current_1.equals("S28-1")) {
            if (prev_1.equals("S27-1")) {
                dir_1 = RIGHT_1;
            } else {
                dir_1 = LEFT_1;
            }
        } else if (current_1.equals("S29-1")) {
            if (prev_1 == null) {
                dir_1 = LEFT_1;
            } else if (prev_1.equals("S28-1")) {
                dir_1 = RIGHT_1;
            }
        } else if (current_1.equals("S29-2")) {
            if (prev_1.equals("S28-1")) {
                dir_1 = CROSS_RIGHT_1;
                if (posX_1 >= 500 || posY_1 >= 630) {
                    dir_1 = RIGHT_1;
                }
            } else {
                dir_1 = LEFT_1;
                if (posX_1 <= 500) {
                    dir_1 = CROSS_LEFT_UP_1;
                }
            }
        }
    }

    private void moveIt_1() {
        while (moveit) {
            if (((int) posY_1) == 351) {
                while (CriticalSection) {
                    System.out.print(" ");
                }
            }

            if (speed_1 != 0) {
                if (current_1.equals("S27-1")) {
                    break;
                }

                TableModel.setValueAt("Boston", 0, 1);
                TableModel.setValueAt("Stoneham", 0, 2);
                TableModel.setValueAt(3, 0, 3);
                TableModel.setValueAt((int) (speed_1 * 100), 0, 4);
                TableModel.setValueAt(current_1, 0, 5);
                if (!flag_1) {
                    if ((posX_1 >= 600 && posX_1 <= 610) && current_1.equals("S5-2")) {
                        if (picked_stations_1.contains("Alewife")) {
                            if ((b2r_1 == 1 && visited_1.get("Alewife") == 0) || (b2r_1 == 0 && visited_1.get("Alewife") == 1)) {
                                speed_1 = 0;
                                flag_1 = true;
                                startTime_1 = System.currentTimeMillis();
                                System.out.println("Waiting at Alewife station");
                                if (b2r_1 == 1) {
                                    visited_1.put("Alewife", 1);
                                } else {
                                    visited_1.put("Alewife", 2);
                                }
                                continue;
                            }

                        }
                    } else if ((posX_1 >= 600 && posX_1 <= 610) && current_1.equals("S5-1")) {
                        if (picked_stations_1.contains("Alewife")) {
                            if ((b2r_1 == 1 && visited_1.get("Alewife") == 0) || (b2r_1 == 0 && visited_1.get("Alewife") == 1)) {
                                speed_1 = 0;
                                flag_1 = true;
                                startTime_1 = System.currentTimeMillis();
                                System.out.println("Waiting at Alewife station");
                                if (b2r_1 == 1) {
                                    visited_1.put("Alewife", 1);
                                } else {
                                    visited_1.put("Alewife", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_1 >= 150 && posX_1 <= 160) && current_1.equals("S10-1")) {
                        if (picked_stations_1.contains("Medford")) {
                            if ((b2r_1 == 1 && visited_1.get("Medford") == 0) || (b2r_1 == 0 && visited_1.get("Medford") == 1)) {
                                speed_1 = 0;
                                flag_1 = true;
                                startTime_1 = System.currentTimeMillis();
                                System.out.println("Waiting at Medford station");
                                if (b2r_1 == 1) {
                                    visited_1.put("Medford", 1);
                                } else {
                                    visited_1.put("Medford", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_1 >= 150 && posX_1 <= 160) && current_1.equals("S10-2")) {
                        if (picked_stations_1.contains("Medford")) {
                            if ((b2r_1 == 1 && visited_1.get("Medford") == 0) || (b2r_1 == 0 && visited_1.get("Medford") == 1)) {
                                speed_1 = 0;
                                flag_1 = true;
                                startTime_1 = System.currentTimeMillis();
                                System.out.println("Waiting at Medford station");
                                if (b2r_1 == 1) {
                                    visited_1.put("Medford", 1);
                                } else {
                                    visited_1.put("Medford", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_1 >= 410 && posX_1 <= 420) && current_1.equals("S19-1")) {
                        if (picked_stations_1.contains("Melrose")) {
                            if ((b2r_1 == 1 && visited_1.get("Melrose") == 0) || (b2r_1 == 0 && visited_1.get("Melrose") == 1)) {
                                speed_1 = 0;
                                flag_1 = true;
                                startTime_1 = System.currentTimeMillis();
                                System.out.println("Waiting at Melrose station");
                                if (b2r_1 == 1) {
                                    visited_1.put("Melrose", 1);
                                } else {
                                    visited_1.put("Melrose", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_1 >= 410 && posX_1 <= 420) && current_1.equals("S19-2")) {
                        if (picked_stations_1.contains("Melrose")) {
                            if ((b2r_1 == 1 && visited_1.get("Melrose") == 0) || (b2r_1 == 0 && visited_1.get("Melrose") == 1)) {
                                speed_1 = 0;
                                flag_1 = true;
                                startTime_1 = System.currentTimeMillis();
                                System.out.println("Waiting at Melrose station");
                                if (b2r_1 == 1) {
                                    visited_1.put("Melrose", 1);
                                } else {
                                    visited_1.put("Melrose", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_1 >= 110 && posX_1 <= 120) && current_1.equals("S25-2")) {
                        if (picked_stations_1.contains("Stoneham")) {
                            if ((b2r_1 == 1 && visited_1.get("Stoneham") == 0) || (b2r_1 == 0 && visited_1.get("Stoneham") == 1)) {
                                speed_1 = 0;
                                flag_1 = true;
                                startTime_1 = System.currentTimeMillis();
                                System.out.println("Waiting at Stoneham station");
                                if (b2r_1 == 1) {
                                    visited_1.put("Stoneham", 1);
                                } else {
                                    visited_1.put("Stoneham", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_1 >= 110 && posX_1 <= 120) && current_1.equals("S25-3")) {
                        if (picked_stations_1.contains("Stoneham")) {
                            if ((b2r_1 == 1 && visited_1.get("Stoneham") == 0) || (b2r_1 == 0 && visited_1.get("Stoneham") == 1)) {
                                speed_1 = 0;
                                flag_1 = true;
                                startTime_1 = System.currentTimeMillis();
                                System.out.println("Waiting at Stoneham station");
                                if (b2r_1 == 1) {
                                    visited_1.put("Stoneham", 1);
                                } else {
                                    visited_1.put("Stoneham", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_1 >= 510 && posX_1 <= 520) && current_1.equals("S29-1")) {
                        if (picked_stations_1.contains("Reading")) {
                            if ((b2r_1 == 1 && visited_1.get("Reading") == 0) || (b2r_1 == 0 && visited_1.get("Reading") == 1)) {
                                speed_1 = 0;
                                flag_1 = true;
                                startTime_1 = System.currentTimeMillis();
                                System.out.println("Waiting at Reading station");
                                if (b2r_1 == 1) {
                                    visited_1.put("Reading", 1);
                                } else {
                                    visited_1.put("Reading", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_1 >= 510 && posX_1 <= 520) && current_1.equals("S29-2")) {
                        if (picked_stations_1.contains("Reading")) {
                            if ((b2r_1 == 1 && visited_1.get("Reading") == 0) || (b2r_1 == 0 && visited_1.get("Reading") == 1)) {
                                speed_1 = 0;
                                flag_1 = true;
                                startTime_1 = System.currentTimeMillis();
                                System.out.println("Waiting at Reading station");
                                if (b2r_1 == 1) {
                                    visited_1.put("Reading", 1);
                                } else {
                                    visited_1.put("Reading", 2);
                                }
                                continue;
                            }
                        }
                    }
                }

                /*System.out.println(posX + " " + posY + " " + nextStop + " DIR: " + dir);
				System.out.println(current + " " + next_section);
				System.out.println(next);*/
                if (dir_1 == RIGHT_1) {
                    posX_1 += speed_1;
                    if (posX_1 >= nextStop_1.x) {
                        // posX = nextStop.x;
                        if (!next_1.isEmpty()) {
                            nextStop_1 = next_1.poll();
                        } else {
                            updateNext_1();
                        }
                        updateDir_1();
                    }
                } else if (dir_1 == LEFT_1) {
                    posX_1 -= speed_1;
                    if (posX_1 <= nextStop_1.x) {
                        // posX = nextStop.x;
                        if (!next_1.isEmpty()) {
                            nextStop_1 = next_1.poll();
                        } else {
                            updateNext_1();
                        }
                        updateDir_1();
                    }
                } else if (dir_1 == UP_1) {
                    posY_1 -= speed_1;
                    if (posY_1 <= nextStop_1.y) {
                        // posY = nextStop.y;
                        if (!next_1.isEmpty()) {
                            nextStop_1 = next_1.poll();
                        } else {
                            updateNext_1();
                        }
                        updateDir_1();
                    }
                } else if (dir_1 == DOWN_1) {
                    posY_1 += speed_1;
                    if (posY_1 >= nextStop_1.y) {
                        // posY = nextStop.y;
                        if (!next_1.isEmpty()) {
                            nextStop_1 = next_1.poll();
                        } else {
                            updateNext_1();
                        }
                        updateDir_1();
                    }
                } else if (dir_1 == CROSS_RIGHT_1) {
                    posX_1 += speed_1;
                    posY_1 += speed_1;
                    if (posY_1 >= nextStop_1.y || posX_1 >= nextStop_1.x) {
                        // posY = nextStop.y;
                        if (!next_1.isEmpty()) {
                            nextStop_1 = next_1.poll();
                        } else {
                            updateNext_1();
                        }
                        updateDir_1();
                    }
                } else if (dir_1 == CROSS_LEFT_1) {
                    posX_1 -= speed_1;
                    posY_1 += speed_1;
                    if (posY_1 >= nextStop_1.y || posX_1 <= nextStop_1.x) {
                        // posY = nextStop.y;
                        if (!next_1.isEmpty()) {
                            nextStop_1 = next_1.poll();
                        } else {
                            updateNext_1();
                        }
                        updateDir_1();
                    }
                } else if (dir_1 == CROSS_LEFT_UP_1) {
                    posX_1 -= speed_1;
                    posY_1 -= speed_1;
                    if (posY_1 <= nextStop_1.y || posX_1 <= nextStop_1.x) {
                        // posY = nextStop.y;
                        if (!next_1.isEmpty()) {
                            nextStop_1 = next_1.poll();
                        } else {
                            updateNext_1();
                        }
                        updateDir_1();
                    }
                } else if (dir_1 == CROSS_RIGHT_UP_1) {
                    posX_1 += speed_1;
                    posY_1 -= speed_1;
                    if (posY_1 <= nextStop_1.y || posX_1 >= nextStop_1.x) {
                        // posY = nextStop.y;
                        if (!next_1.isEmpty()) {
                            nextStop_1 = next_1.poll();
                        } else {
                            updateNext_1();
                        }
                        updateDir_1();
                    }
                }
            } else if (flag_1) {
                if (System.currentTimeMillis() - startTime_1 >= 2000) {
                    flag_1 = false;
                    System.out.println("Leaving station");
                    speed_1 = speedLimit_1.get(current_1) / 100.0;
                }
            }
            try {
                Thread.sleep(10);
            } catch (Exception exc) {
            }
            frame.repaint();
        }
    }

    private void readTrackdb_2() {
        try {
            File file = new File("trackdb.txt");
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] tokens = line.trim().split(" ");
                if (tokens[0].contains("SW")) {
                    String[] vals = tokens[1].trim().split(",");
                    int x = Integer.valueOf(vals[0]);
                    int y = Integer.valueOf(vals[1]);
                    Point p = new Point(x, y);
                    switches_2.put(tokens[0], p);
                } else {
                    String[] vals = tokens[1].trim().split(";");
                    ArrayList<Point> points = new ArrayList<>();
                    for (int i = 0; i < vals.length; ++i) {
                        String[] vals2 = vals[i].trim().split(",");
                        int x = Integer.valueOf(vals2[0]);
                        int y = Integer.valueOf(vals2[1]);
                        Point p = new Point(x, y);
                        points.add(p);
                    }
                    int speed = Integer.valueOf(tokens[2].trim());
                    sections_2.put(tokens[0], points);
                    speedLimit_2.put(tokens[0], speed);
                }
            }
            in.close();
            in = new Scanner(new File("route3.txt"));
            while (in.hasNextLine()) {
                route_2 = in.nextLine().trim().split(" ");
            }
            in.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        prev_2 = null;
    }

    private void updateNext_2() {
        String key;
        if (b2r_2 == 1) {
            /*if (location + 1 < route.length && picked_stations.contains(sec2sta.get(route[location+1])) && visited.get(sec2sta.get(route[location+1])) == 0) {
				speed = 0;
				flag = true;
				startTime = System.currentTimeMillis();
				visited.put(sec2sta.get(route[location+1]), 1);
				System.out.println("Waiting at station: " + sec2sta.get(route[location+1]));
				return;
				long time = System.currentTimeMillis();
				while(System.currentTimeMillis() - time <= 2000);
			}*/
            location_2++;
            if (location_2 >= route_2.length) {
                speed_2 = 0;
                b2r_2 = 0;
                prev_2 = null;
                return;
            }
            key = route_2[location_2];
            prev_2 = current_2;
            current_2 = key;
            speed_2 = speedLimit_2.get(current_2) / 100.0;
            if (location_2 + 1 < route_2.length) {
                next_section_2 = route_2[location_2 + 1];
            } else {
                next_section_2 = key;
            }
        } else {
            location_2--;
            if (location_2 < 0) {
                speed_2 = 0;
                b2r_2 = 1;
                prev_2 = null;
                return;
            }
            key = route_2[location_2];
            prev_2 = current_2;
            current_2 = key;
            speed_2 = speedLimit_2.get(current_2) / 100.0;
            if (location_2 - 1 >= 0) {
                next_section_2 = route_2[location_2 - 1];
            } else {
                next_section_2 = key;
            }
        }

        ArrayList<Point> tempPoints = sections_2.get(key);
        for (int i = 0; i < tempPoints.size(); ++i) {
            if (b2r_2 == 1) {
                next_2.add(tempPoints.get(i));
            } else {
                next_2.add(tempPoints.get(tempPoints.size() - i - 1));
            }
        }
        //System.out.println("Inside update: " + current + " " + next_section);
    }

    private void updateDir_2() {

        if (current_2.equals("S2-1")) {
            if (prev_2.equals("S1-1")) {
                dir_2 = RIGHT_2;
            } else if (prev_2.equals("S3-1")) {
                dir_2 = LEFT_2;
            }
        } else if (current_2.equals("S3-1")) {
            if (prev_2.equals("S2-1")) {
                dir_2 = RIGHT_2;
            } else if (prev_2.equals("S4-2")) {
                dir_2 = CROSS_LEFT_UP_2;
                if (posY_2 <= 50) {
                    dir_2 = LEFT_2;
                }
            } else if (prev_2.equals("S4-1")) {
                dir_2 = LEFT_2;
            }
        } else if (current_2.equals("S4-1")) {
            if (prev_2.equals("S3-1")) {
                dir_2 = RIGHT_2;
            } else if (prev_2.equals("S5-2")) {
                dir_2 = CROSS_LEFT_UP_2;
                if (posY_2 <= 50) {
                    dir_2 = LEFT_2;
                }
            } else if (prev_2.equals("S5-1")) {
                dir_2 = LEFT_2;
            }
        } else if (current_2.equals("S4-2")) {
            if (prev_2.equals("S3-1")) {
                dir_2 = CROSS_RIGHT_2;
                if (posX_2 >= 450 || posY_2 >= 100) {
                    dir_2 = RIGHT_2;
                }
            } else if (prev_2.equals("S6-2")) {
                dir_2 = LEFT_2;
            } else if (prev_2.equals("S3-2")) {
                dir_2 = RIGHT_2;
            }
        } else if (current_2.equals("S5-1")) {
            if (prev_2.equals("S4-1")) {
                dir_2 = RIGHT_2;
            } else if (prev_2.equals("S6-1")) {
                dir_2 = LEFT_2;
            } else if (prev_2.equals("S4-2")) {
                dir_2 = CROSS_RIGHT_UP_2;
                if (posY_2 <= 50) {
                    dir_2 = RIGHT_2;
                }

            }
        } else if (current_2.equals("S5-2")) {
            if (prev_2.equals("S4-1")) {
                dir_2 = CROSS_RIGHT_2;
                if (posX_2 >= 550 || posY_2 >= 100) {
                    dir_2 = RIGHT_2;
                }
            } else if (prev_2.equals("S6-2")) {
                dir_2 = LEFT_2;
            } else if (prev_2.equals("S4-2")) {
                dir_2 = RIGHT_2;
            }
        } else if (current_2.equals("S6-1")) {
            if (prev_2.equals("S5-1")) {
                dir_2 = RIGHT_2;
                if (posX_2 >= 650) {
                    dir_2 = DOWN_2;
                }
            } else if (prev_2.equals("S7-1")) {
                dir_2 = UP_2;
                if (posY_2 <= 45) {
                    dir_2 = LEFT_2;
                }
            }
        } else if (current_2.equals("S6-2")) {
            if (prev_2.equals("S5-2")) {
                dir_2 = DOWN_2;
                if (posX_2 >= 620 && posY_2 >= 180) {
                    dir_2 = CROSS_RIGHT_2;
                }
            } else if (prev_2.equals("S7-1")) {
                dir_2 = CROSS_LEFT_UP_2;
                if (posX_2 <= 620 || posY_2 <= 180) {
                    dir_2 = UP_2;
                }
            }
        } else if (current_2.equals("S7-1")) {
            if (prev_2.equals("S6-1") || prev_2.equals("S6-2")) {
                dir_2 = DOWN_2;
                if (posY_2 >= 250) {
                    dir_2 = LEFT_2;
                }
            } else if (prev_2.equals("S8-1") || prev_2.equals("S8-2")) {
                dir_2 = RIGHT_2;
                if (posX_2 >= 640) {
                    dir_2 = UP_2;
                }
            }
        } else if (current_2.equals("S8-1")) {
            if (prev_2.equals("S7-1")) {
                dir_2 = CROSS_LEFT_UP_2;
                if (posY_2 <= 200 || posX_2 <= 550) {
                    dir_2 = LEFT_2;
                }
                if (posX_2 <= 400) {
                    dir_2 = CROSS_LEFT_2;
                }
            } else if (prev_2.equals("S9-1")) {
                dir_2 = CROSS_RIGHT_UP_2;
                if (posY_2 <= 200 || posX_2 >= 400) {
                    dir_2 = RIGHT_2;
                }
                if (posX_2 >= 550) {
                    dir_2 = CROSS_RIGHT_2;
                }
            }

        } else if (current_2.equals("S8-2")) {
            if (prev_2.equals("S7-1")) {
                dir_2 = LEFT_2;
            } else if (prev_2.equals("S9-1")) {
                dir_2 = RIGHT_2;
            }
        } else if (current_2.equals("S9-1")) {
            if (prev_2.equals("S8-1") || prev_2.equals("S8-2")) {
                dir_2 = LEFT_2;
            } else if (prev_2.equals("S10-1") || prev_2.equals("S10-2")) {
                dir_2 = RIGHT_2;
            }
        } else if (current_2.equals("S10-1")) {
            if (prev_2.equals("S9-1")) {
                dir_2 = LEFT_2;
            } else if (prev_2.equals("S11-1")) {
                dir_2 = RIGHT_2;
            }
        } else if (current_2.equals("S10-2")) {
            if (prev_2.equals("S9-1")) {
                dir_2 = CROSS_LEFT_2;
                if (posY_2 >= 300 || posX_2 <= 250) {
                    dir_2 = LEFT_2;
                }
                if (posX_2 <= 100) {
                    dir_2 = CROSS_LEFT_UP_2;
                }
            } else if (prev_2.equals("S11-1")) {
                dir_2 = CROSS_RIGHT_2;
                if (posY_2 >= 300 || posX_2 >= 100) {
                    dir_2 = RIGHT_2;
                }
                if (posX_2 >= 250) {
                    dir_2 = CROSS_RIGHT_UP_2;
                }
            }
        } else if (current_2.equals("S11-1")) {
            if (prev_2.equals("S10-1") || prev_2.equals("S10-2")) {
                dir_2 = LEFT_2;
                if (posX_2 <= 40) {
                    dir_2 = DOWN_2;
                }
            } else if (prev_2.equals("S12-1")) {
                dir_2 = UP_2;
                if (posY_2 <= 250) {
                    dir_2 = RIGHT_2;
                }
            }
        } else if (current_2.equals("S12-1")) {
            if (prev_2.equals("S11-1")) {
                dir_2 = RIGHT_2;
            } else if (prev_2.equals("S18-1")) {
                dir_2 = LEFT_2;
            }
        } else if (current_2.equals("S13-1")) {
            if (prev_2.equals("S12-1") || prev_2.equals("S14-1")) {
                dir_2 = CROSS_RIGHT_2;
                if (posX_2 >= 400 || posY_2 <= 300) {
                    dir_2 = RIGHT_2;
                }
            }
        } else if (current_2.equals("S16-1")) {
            if (prev_2.equals("S17-1")) {
                dir_2 = DOWN_2;
                if (posY_2 >= 650) {
                    dir_2 = LEFT_2;
                }
                if (posX_2 <= 40) {
                    dir_2 = UP_2;
                }
            }
        } else if (current_2.equals("S17-1")) {
            if (prev_2.equals("S13-1")) {
                dir_2 = RIGHT_2;
                if (posX_2 >= 650) {
                    dir_2 = DOWN_2;
                }
            }
        } else if (current_2.equals("S18-1")) {
            if (prev_2.equals("S12-1") || prev_2.equals("S13-1") || prev_2.equals("S14-1")) {
                dir_2 = RIGHT_2;
            } else if (prev_2.equals("S19-1") || prev_2.equals("S19-2")) {
                dir_2 = LEFT_2;
            }
        } else if (current_2.equals("S19-1")) {
            if (prev_2.equals("S18-1")) {
                dir_2 = RIGHT_2;
            } else if (prev_2.equals("S20-1")) {
                dir_2 = LEFT_2;
            }
        } else if (current_2.equals("S19-2")) {
            if (prev_2.equals("S18-1")) {
                dir_2 = CROSS_RIGHT_2;
                if (posX_2 >= 400 || posY_2 >= 400) {
                    dir_2 = RIGHT_2;
                }
                if (posX_2 >= 500) {
                    dir_2 = CROSS_RIGHT_UP_2;
                }
            }
            if (prev_2.equals("S20-1")) {
                dir_2 = CROSS_LEFT_2;
                if (posX_2 <= 550 || posY_2 >= 400) {
                    dir_2 = LEFT_2;
                }
                if (posX_2 <= 400) {
                    dir_2 = CROSS_LEFT_UP_2;
                }
            }
        } else if (current_2.equals("S20-1")) {
            if (prev_2.equals("S19-1")) {
                dir_2 = RIGHT_2;
                if (posX_2 >= 620) {
                    dir_2 = DOWN_2;
                }
            } else if (prev_2.equals("S19-2")) {
                dir_2 = CROSS_RIGHT_UP_2;
                if (posY_2 <= 350) {
                    dir_2 = RIGHT_2;
                }
                if (posX_2 >= 620) {
                    dir_2 = DOWN_2;
                }
            } else if (prev_2.equals("S21-1")) {
                dir_2 = UP_2;
                if (posY_2 <= 350) {
                    dir_2 = LEFT_2;
                }
            }
        } else if (current_2.equals("S21-1")) {
            if (prev_2.equals("S20-1")) {
                dir_2 = DOWN_2;
                if (posY_2 >= 470) {
                    dir_2 = LEFT_2;
                }
            } else if (prev_2.equals("S22-1") || prev_2.equals("S22-2")) {
                dir_2 = RIGHT_2;
                if (posX_2 >= 600) {
                    dir_2 = UP_2;
                }
            }
        } else if (current_2.equals("S22-1")) {
            if (prev_2.equals("S21-1")) {
                dir_2 = CROSS_LEFT_UP_2;
                if (posX_2 <= 550 || posY_2 <= 420) {
                    dir_2 = LEFT_2;
                }
                if (posX_2 <= 450) {
                    dir_2 = CROSS_LEFT_2;
                }
            } else if (prev_2.equals("S23-1")) {
                dir_2 = CROSS_RIGHT_UP_2;
                if (posX_2 >= 450 || posY_2 <= 420) {
                    dir_2 = RIGHT_2;
                }
                if (posX_2 >= 550) {
                    dir_2 = CROSS_RIGHT_2;
                }
            }
        } else if (current_2.equals("S22-2")) {
            if (prev_2.equals("S21-1")) {
                dir_2 = LEFT_2;
            } else if (prev_2.equals("S23-1")) {
                dir_2 = RIGHT_2;
            }
        } else if (current_2.equals("S23-1")) {
            if (prev_2.equals("S22-1") || prev_2.equals("S22-2")) {
                dir_2 = LEFT_2;
            } else if (prev_2.equals("S24-1") || prev_2.equals("S25-1")) {
                dir_2 = RIGHT_2;
            }
        } else if (current_2.equals("S24-1")) {
            if (prev_2.equals("S23-1")) {
                dir_2 = CROSS_LEFT_2;
                if (posX_2 <= 300 || posY_2 >= 520) {
                    dir_2 = LEFT_2;
                }
            } else if (prev_2.equals("S25-2") || prev_2.equals("S25-3")) {
                dir_2 = RIGHT_2;
                if (posX_2 >= 300) {
                    dir_2 = CROSS_RIGHT_UP_2;
                }
            }
        } else if (current_2.equals("S25-1")) {
            if (prev_2.equals("S23-1")) {
                dir_2 = LEFT_2;
            }
        } else if (current_2.equals("S25-2")) {
            if (prev_2.equals("S24-1")) {
                dir_2 = LEFT_2;
            } else if (prev_2.equals("S26-1")) {
                dir_2 = RIGHT_2;
            }
        } else if (current_2.equals("S25-3")) {
            if (prev_2.equals("S24-1")) {
                dir_2 = CROSS_LEFT_2;
                if (posX_2 <= 250 || posY_2 >= 550) {
                    dir_2 = LEFT_2;
                }
                if (posX_2 <= 100) {
                    dir_2 = CROSS_LEFT_UP_2;
                }
            } else if (prev_2.equals("S26-1")) {
                dir_2 = CROSS_RIGHT_2;
                if (posX_2 >= 100 || posY_2 >= 550) {
                    dir_2 = RIGHT_2;
                }
                if (posX_2 >= 250) {
                    dir_2 = CROSS_RIGHT_UP_2;
                }
            }
        } else if (current_2.equals("S26-1")) {
            if (prev_2.equals("S25-2") || prev_2.equals("S25-3")) {
                dir_2 = LEFT_2;
                if (posX_2 <= 50 || posY_2 >= 550) {
                    dir_2 = DOWN_2;
                }
                if (posY_2 >= 650) {
                    dir_2 = RIGHT_2;
                }
            } else if (prev_2.equals("S27-1")) {
                dir_2 = LEFT_2;
                if (posX_2 <= 50 && posY_2 > 520) {
                    dir_2 = UP_2;
                }
                if (posY_2 <= 520) {
                    dir_2 = RIGHT_2;
                }
            }
        } else if (current_2.equals("S27-1")) {
            if (prev_2.equals("S26-1")) {
                dir_2 = RIGHT_2;
            } else if (prev_2.equals("S28-1")) {
                dir_2 = LEFT_2;
            }
        } else if (current_2.equals("S28-1")) {
            if (prev_2.equals("S27-1")) {
                dir_2 = RIGHT_2;
            } else {
                dir_2 = LEFT_2;
            }
        } else if (current_2.equals("S29-1")) {
            if (prev_2 == null) {
                dir_2 = LEFT_2;
            } else if (prev_2.equals("S28-1")) {
                dir_2 = RIGHT_2;
            }
        } else if (current_2.equals("S29-2")) {
            if (prev_2.equals("S28-1")) {
                dir_2 = CROSS_RIGHT_2;
                if (posX_2 >= 500 || posY_2 >= 630) {
                    dir_2 = RIGHT_2;
                }
            } else {
                dir_2 = LEFT_2;
                if (posX_2 <= 500) {
                    dir_2 = CROSS_LEFT_UP_2;
                }
            }
        }
    }
//   

    private void moveIt_2() {

        while (moveit) {

            if (((int) posY_2) == 351) {
                while (CriticalSection) {
                    System.out.println(" ");
                }
            }

            if ((((int) posX_2) == 522) && (((int) posY_2) == 601)) {
                break;
            }

            if (speed_2 != 0) {
                if (current_2.equals("S19-2")) {
                    flag_scheduling = false;
                }

                TableModel.setValueAt("Medford", 1, 1);
                TableModel.setValueAt("Reading", 1, 2);
                TableModel.setValueAt(3, 1, 3);
                TableModel.setValueAt((int) (speed_2 * 100), 1, 4);
                TableModel.setValueAt(current_2, 1, 5);

                if (!flag_2) {
                    if ((posX_2 >= 600 && posX_2 <= 610) && current_2.equals("S5-2")) {
                        if (picked_stations_2.contains("Alewife")) {
                            if ((b2r_2 == 1 && visited_2.get("Alewife") == 0) || (b2r_2 == 0 && visited_2.get("Alewife") == 1)) {
                                speed_2 = 0;
                                flag_2 = true;
                                startTime_2 = System.currentTimeMillis();
                                System.out.println("Waiting at Alewife station");
                                if (b2r_2 == 1) {
                                    visited_2.put("Alewife", 1);
                                } else {
                                    visited_2.put("Alewife", 2);
                                }
                                continue;
                            }

                        }
                    } else if ((posX_2 >= 600 && posX_2 <= 610) && current_2.equals("S5-1")) {
                        if (picked_stations_2.contains("Alewife")) {
                            if ((b2r_2 == 1 && visited_2.get("Alewife") == 0) || (b2r_2 == 0 && visited_2.get("Alewife") == 1)) {
                                speed_2 = 0;
                                flag_2 = true;
                                startTime_2 = System.currentTimeMillis();
                                System.out.println("Waiting at Alewife station");
                                if (b2r_2 == 1) {
                                    visited_2.put("Alewife", 1);
                                } else {
                                    visited_2.put("Alewife", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_2 >= 150 && posX_2 <= 160) && current_2.equals("S10-1")) {
                        if (picked_stations_2.contains("Medford")) {
                            if ((b2r_2 == 1 && visited_2.get("Medford") == 0) || (b2r_2 == 0 && visited_2.get("Medford") == 1)) {
                                speed_2 = 0;
                                flag_2 = true;
                                startTime_2 = System.currentTimeMillis();
                                System.out.println("Waiting at Medford station");
                                if (b2r_2 == 1) {
                                    visited_2.put("Medford", 1);
                                } else {
                                    visited_2.put("Medford", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_2 >= 150 && posX_2 <= 160) && current_2.equals("S10-2")) {
                        if (picked_stations_2.contains("Medford")) {
                            if ((b2r_2 == 1 && visited_2.get("Medford") == 0) || (b2r_2 == 0 && visited_2.get("Medford") == 1)) {
                                speed_2 = 0;
                                flag_2 = true;
                                startTime_2 = System.currentTimeMillis();
                                System.out.println("Waiting at Medford station");
                                if (b2r_2 == 1) {
                                    visited_2.put("Medford", 1);
                                } else {
                                    visited_2.put("Medford", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_2 >= 410 && posX_2 <= 420) && current_2.equals("S19-1")) {
                        if (picked_stations_2.contains("Melrose")) {
                            if ((b2r_2 == 1 && visited_2.get("Melrose") == 0) || (b2r_2 == 0 && visited_2.get("Melrose") == 1)) {
                                speed_2 = 0;
                                flag_2 = true;
                                startTime_2 = System.currentTimeMillis();
                                System.out.println("Waiting at Melrose station");
                                if (b2r_2 == 1) {
                                    visited_2.put("Melrose", 1);
                                } else {
                                    visited_2.put("Melrose", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_2 >= 410 && posX_2 <= 420) && current_2.equals("S19-2")) {
                        if (picked_stations_2.contains("Melrose")) {
                            if ((b2r_2 == 1 && visited_2.get("Melrose") == 0) || (b2r_2 == 0 && visited_2.get("Melrose") == 1)) {
                                speed_2 = 0;
                                flag_2 = true;
                                startTime_2 = System.currentTimeMillis();
                                System.out.println("Waiting at Melrose station");
                                if (b2r_2 == 1) {
                                    visited_2.put("Melrose", 1);
                                } else {
                                    visited_2.put("Melrose", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_2 >= 110 && posX_2 <= 120) && current_2.equals("S25-2")) {
                        if (picked_stations_2.contains("Stoneham")) {
                            if ((b2r_2 == 1 && visited_2.get("Stoneham") == 0) || (b2r_2 == 0 && visited_2.get("Stoneham") == 1)) {
                                speed_2 = 0;
                                flag_2 = true;
                                startTime_2 = System.currentTimeMillis();
                                System.out.println("Waiting at Stoneham station");
                                if (b2r_2 == 1) {
                                    visited_2.put("Stoneham", 1);
                                } else {
                                    visited_2.put("Stoneham", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_2 >= 110 && posX_2 <= 120) && current_2.equals("S25-3")) {
                        if (picked_stations_2.contains("Stoneham")) {
                            if ((b2r_2 == 1 && visited_2.get("Stoneham") == 0) || (b2r_2 == 0 && visited_2.get("Stoneham") == 1)) {
                                speed_2 = 0;
                                flag_2 = true;
                                startTime_2 = System.currentTimeMillis();
                                System.out.println("Waiting at Stoneham station");
                                if (b2r_2 == 1) {
                                    visited_2.put("Stoneham", 1);
                                } else {
                                    visited_2.put("Stoneham", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_2 >= 510 && posX_2 <= 520) && current_2.equals("S29-1")) {
                        if (picked_stations_2.contains("Reading")) {
                            if ((b2r_2 == 1 && visited_2.get("Reading") == 0) || (b2r_2 == 0 && visited_2.get("Reading") == 1)) {
                                speed_2 = 0;
                                flag_2 = true;
                                startTime_2 = System.currentTimeMillis();
                                System.out.println("Waiting at Reading station");
                                if (b2r_2 == 1) {
                                    visited_2.put("Reading", 1);
                                } else {
                                    visited_2.put("Reading", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_2 >= 510 && posX_2 <= 520) && current_2.equals("S29-2")) {
                        if (picked_stations_2.contains("Reading")) {
                            if ((b2r_2 == 1 && visited_2.get("Reading") == 0) || (b2r_2 == 0 && visited_2.get("Reading") == 1)) {
                                speed_2 = 0;
                                flag_2 = true;
                                startTime_2 = System.currentTimeMillis();
                                System.out.println("Waiting at Reading station");
                                if (b2r_2 == 1) {
                                    visited_2.put("Reading", 1);
                                } else {
                                    visited_2.put("Reading", 2);
                                }
                                continue;
                            }
                        }
                    }
                }

                /*System.out.println(posX + " " + posY + " " + nextStop + " DIR: " + dir);
				System.out.println(current + " " + next_section);
				System.out.println(next);*/
                if (dir_2 == RIGHT_2) {
                    posX_2 += speed_2;
                    if (posX_2 >= nextStop_2.x) {
                        // posX = nextStop.x;
                        if (!next_2.isEmpty()) {
                            nextStop_2 = next_2.poll();
                        } else {
                            updateNext_2();
                        }
                        updateDir_2();
                    }
                } else if (dir_2 == LEFT_2) {
                    posX_2 -= speed_2;
                    if (posX_2 <= nextStop_2.x) {
                        // posX = nextStop.x;
                        if (!next_2.isEmpty()) {
                            nextStop_2 = next_2.poll();
                        } else {
                            updateNext_2();
                        }
                        updateDir_2();
                    }
                } else if (dir_2 == UP_2) {
                    posY_2 -= speed_2;
                    if (posY_2 <= nextStop_2.y) {
                        // posY = nextStop.y;
                        if (!next_2.isEmpty()) {
                            nextStop_2 = next_2.poll();
                        } else {
                            updateNext_2();
                        }
                        updateDir_2();
                    }
                } else if (dir_2 == DOWN_2) {
                    posY_2 += speed_2;
                    if (posY_2 >= nextStop_2.y) {
                        // posY = nextStop.y;
                        if (!next_2.isEmpty()) {
                            nextStop_2 = next_2.poll();
                        } else {
                            updateNext_2();
                        }
                        updateDir_2();
                    }
                } else if (dir_2 == CROSS_RIGHT_2) {
                    posX_2 += speed_2;
                    posY_2 += speed_2;
                    if (posY_2 >= nextStop_2.y || posX_2 >= nextStop_2.x) {
                        // posY = nextStop.y;
                        if (!next_2.isEmpty()) {
                            nextStop_2 = next_2.poll();
                        } else {
                            updateNext_2();
                        }
                        updateDir_2();
                    }
                } else if (dir_2 == CROSS_LEFT_2) {
                    posX_2 -= speed_2;
                    posY_2 += speed_2;
                    if (posY_2 >= nextStop_2.y || posX_2 <= nextStop_2.x) {
                        // posY = nextStop.y;
                        if (!next_2.isEmpty()) {
                            nextStop_2 = next_2.poll();
                        } else {
                            updateNext_2();
                        }
                        updateDir_2();
                    }
                } else if (dir_2 == CROSS_LEFT_UP_2) {
                    posX_2 -= speed_2;
                    posY_2 -= speed_2;
                    if (posY_2 <= nextStop_2.y || posX_2 <= nextStop_2.x) {
                        // posY = nextStop.y;
                        if (!next_2.isEmpty()) {
                            nextStop_2 = next_2.poll();
                        } else {
                            updateNext_2();
                        }
                        updateDir_2();
                    }
                } else if (dir_2 == CROSS_RIGHT_UP_2) {
                    posX_2 += speed_2;
                    posY_2 -= speed_2;
                    if (posY_2 <= nextStop_2.y || posX_2 >= nextStop_2.x) {
                        // posY = nextStop.y;
                        if (!next_2.isEmpty()) {
                            nextStop_2 = next_2.poll();
                        } else {
                            updateNext_2();
                        }
                        updateDir_2();
                    }
                }
            } else if (flag_2) {
                if (System.currentTimeMillis() - startTime_2 >= 2000) {
                    flag_2 = false;
                    System.out.println("Leaving station");
                    speed_2 = speedLimit_2.get(current_2) / 100.0;
                }
            }
            try {
                Thread.sleep(10);
            } catch (Exception exc) {
            }
            frame.repaint();
        }
    }

    private void readTrackdb_3() {
        try {
            File file = new File("trackdb.txt");
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                String line = in.nextLine();

                String[] tokens = line.trim().split(" ");
                if (tokens[0].contains("SW")) {
                    String[] vals = tokens[1].trim().split(",");
                    int x = Integer.valueOf(vals[0]);
                    int y = Integer.valueOf(vals[1]);
                    Point p = new Point(x, y);
                    switches_3.put(tokens[0], p);
                } else {
                    String[] vals = tokens[1].trim().split(";");
                    ArrayList<Point> points = new ArrayList<>();
                    for (int i = 0; i < vals.length; ++i) {
                        String[] vals2 = vals[i].trim().split(",");
                        int x = Integer.valueOf(vals2[0]);
                        int y = Integer.valueOf(vals2[1]);
                        Point p = new Point(x, y);
                        points.add(p);
                    }
                    int speed = Integer.valueOf(tokens[2].trim());
                    sections_3.put(tokens[0], points);
                    speedLimit_3.put(tokens[0], speed);
                }
            }
            in.close();
            in = new Scanner(new File("route4.txt"));
            while (in.hasNextLine()) {
                route_3 = in.nextLine().trim().split(" ");
            }
            in.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        prev_3 = null;
    }

    private void updateNext_3() {
        String key;
        if (b2r_3 == 1) {
            /*if (location + 1 < route.length && picked_stations.contains(sec2sta.get(route[location+1])) && visited.get(sec2sta.get(route[location+1])) == 0) {
				speed = 0;
				flag = true;
				startTime = System.currentTimeMillis();
				visited.put(sec2sta.get(route[location+1]), 1);
				System.out.println("Waiting at station: " + sec2sta.get(route[location+1]));
				return;
				long time = System.currentTimeMillis();
				while(System.currentTimeMillis() - time <= 2000);
			}*/
            location_3++;
            if (location_3 >= route_3.length) {
                speed_3 = 0;
                b2r_3 = 0;
                prev_3 = null;
                return;
            }
            key = route_3[location_3];
            prev_3 = current_3;
            current_3 = key;
            speed_3 = speedLimit_3.get(current_3) / 100.0;
            if (location_3 + 1 < route_3.length) {
                next_section_3 = route_3[location_3 + 1];
            } else {
                next_section_3 = key;
            }
        } else {
            location_3--;
            if (location_3 < 0) {
                speed_3 = 0;
                b2r_3 = 1;
                prev_3 = null;
                return;
            }
            key = route_3[location_3];
            prev_3 = current_3;
            current_3 = key;
            speed_3 = speedLimit_3.get(current_3) / 100.0;
            if (location_3 - 1 >= 0) {
                next_section_3 = route_3[location_3 - 1];
            } else {
                next_section_3 = key;
            }
        }

        ArrayList<Point> tempPoints = sections_3.get(key);
        for (int i = 0; i < tempPoints.size(); ++i) {
            if (b2r_3 == 1) {
                next_3.add(tempPoints.get(i));
            } else {
                next_3.add(tempPoints.get(tempPoints.size() - i - 1));
            }
        }
        //System.out.println("Inside update: " + current + " " + next_section);
    }

    private void updateDir_3() {

        if (current_3.equals("S2-1")) {
            if (prev_3.equals("S1-1")) {
                dir_3 = RIGHT_3;
            } else if (prev_3.equals("S3-1")) {
                dir_3 = LEFT_3;
            }
        } else if (current_3.equals("S3-1")) {
            if (prev_3.equals("S2-1")) {
                dir_3 = RIGHT_3;
            } else if (prev_3.equals("S4-2")) {
                dir_3 = CROSS_LEFT_UP_3;
                if (posY_3 <= 50) {
                    dir_3 = LEFT_3;
                }
            } else if (prev_3.equals("S4-1")) {
                dir_3 = LEFT_3;
            }
        } else if (current_3.equals("S4-1")) {
            if (prev_3.equals("S3-1")) {
                dir_3 = RIGHT_3;
            } else if (prev_3.equals("S5-2")) {
                dir_3 = CROSS_LEFT_UP_3;
                if (posY_3 <= 50) {
                    dir_3 = LEFT_3;
                }
            } else if (prev_3.equals("S5-1")) {
                dir_3 = LEFT_3;
            }
        } else if (current_3.equals("S4-2")) {
            if (prev_3.equals("S3-1")) {
                dir_3 = CROSS_RIGHT_3;
                if (posX_3 >= 450 || posY_3 >= 100) {
                    dir_3 = RIGHT_3;
                }
            } else if (prev_3.equals("S6-2")) {
                dir_3 = LEFT_3;
            } else if (prev_3.equals("S3-2")) {
                dir_3 = RIGHT_3;
            }
        } else if (current_3.equals("S5-1")) {
            if (prev_3.equals("S4-1")) {
                dir_3 = RIGHT_3;
            } else if (prev_3.equals("S6-1")) {
                dir_3 = LEFT_3;
            } else if (prev_3.equals("S4-2")) {
                dir_3 = CROSS_RIGHT_UP_3;
                if (posY_3 <= 50) {
                    dir_3 = RIGHT_3;
                }

            }
        } else if (current_3.equals("S5-2")) {
            if (prev_3.equals("S4-1")) {
                dir_3 = CROSS_RIGHT_3;
                if (posX_3 >= 550 || posY_3 >= 100) {
                    dir_3 = RIGHT_3;
                }
            } else if (prev_3.equals("S6-2")) {
                dir_3 = LEFT_3;
            } else if (prev_3.equals("S4-2")) {
                dir_3 = RIGHT_3;
            }
        } else if (current_3.equals("S6-1")) {
            if (prev_3.equals("S5-1")) {
                dir_3 = RIGHT_3;
                if (posX_3 >= 650) {
                    dir_3 = DOWN_3;
                }
            } else if (prev_3.equals("S7-1")) {
                dir_3 = UP_3;
                if (posY_3 <= 45) {
                    dir_3 = LEFT_3;
                }
            }
        } else if (current_3.equals("S6-2")) {
            if (prev_3.equals("S5-2")) {
                dir_3 = DOWN_3;
                if (posX_3 >= 620 && posY_3 >= 180) {
                    dir_3 = CROSS_RIGHT_3;
                }
            } else if (prev_3.equals("S7-1")) {
                dir_3 = CROSS_LEFT_UP_3;
                if (posX_3 <= 620 || posY_3 <= 180) {
                    dir_3 = UP_3;
                }
            }
        } else if (current_3.equals("S7-1")) {
            if (prev_3.equals("S6-1") || prev_3.equals("S6-2")) {
                dir_3 = DOWN_3;
                if (posY_3 >= 250) {
                    dir_3 = LEFT_3;
                }
            } else if (prev_3.equals("S8-1") || prev_3.equals("S8-2")) {
                dir_3 = RIGHT_3;
                if (posX_3 >= 640) {
                    dir_3 = UP_3;
                }
            }
        } else if (current_3.equals("S8-1")) {
            if (prev_3.equals("S7-1")) {
                dir_3 = CROSS_LEFT_UP_3;
                if (posY_3 <= 200 || posX_3 <= 550) {
                    dir_3 = LEFT_3;
                }
                if (posX_3 <= 400) {
                    dir_3 = CROSS_LEFT_3;
                }
            } else if (prev_3.equals("S9-1")) {
                dir_3 = CROSS_RIGHT_UP_3;
                if (posY_3 <= 200 || posX_3 >= 400) {
                    dir_3 = RIGHT_3;
                }
                if (posX_3 >= 550) {
                    dir_3 = CROSS_RIGHT_3;
                }
            }

        } else if (current_3.equals("S8-2")) {
            if (prev_3.equals("S7-1")) {
                dir_3 = LEFT_3;
            } else if (prev_3.equals("S9-1")) {
                dir_3 = RIGHT_3;
            }
        } else if (current_3.equals("S9-1")) {
            if (prev_3.equals("S8-1") || prev_3.equals("S8-2")) {
                dir_3 = LEFT_3;
            } else if (prev_3.equals("S10-1") || prev_3.equals("S10-2")) {
                dir_3 = RIGHT_3;
            }
        } else if (current_3.equals("S10-1")) {
            if (prev_3.equals("S9-1")) {
                dir_3 = LEFT_3;
            } else if (prev_3.equals("S11-1")) {
                dir_3 = RIGHT_3;
            }
        } else if (current_3.equals("S10-2")) {
            if (prev_3.equals("S9-1")) {
                dir_3 = CROSS_LEFT_3;
                if (posY_3 >= 300 || posX_3 <= 250) {
                    dir_3 = LEFT_3;
                }
                if (posX_3 <= 100) {
                    dir_3 = CROSS_LEFT_UP_3;
                }
            } else if (prev_3.equals("S11-1")) {
                dir_3 = CROSS_RIGHT_3;
                if (posY_3 >= 300 || posX_3 >= 100) {
                    dir_3 = RIGHT_3;
                }
                if (posX_3 >= 250) {
                    dir_3 = CROSS_RIGHT_UP_3;
                }
            }
        } else if (current_3.equals("S11-1")) {
            if (prev_3.equals("S10-1") || prev_3.equals("S10-2")) {
                dir_3 = LEFT_3;
                if (posX_3 <= 40) {
                    dir_3 = DOWN_3;
                }
            } else if (prev_3.equals("S12-1")) {
                dir_3 = UP_3;
                if (posY_3 <= 250) {
                    dir_3 = RIGHT_3;
                }
            }
        } else if (current_3.equals("S12-1")) {
            if (prev_3.equals("S11-1")) {
                dir_3 = RIGHT_3;
            } else if (prev_3.equals("S18-1")) {
                dir_3 = LEFT_3;
            }
        } else if (current_3.equals("S13-1")) {
            if (prev_3.equals("S12-1") || prev_3.equals("S14-1")) {
                dir_3 = CROSS_RIGHT_3;
                if (posX_3 >= 400 || posY_3 <= 300) {
                    dir_3 = RIGHT_3;
                }
            }
        } else if (current_3.equals("S16-1")) {
            if (prev_3.equals("S17-1")) {
                dir_3 = DOWN_3;
                if (posY_3 >= 650) {
                    dir_3 = LEFT_3;
                }
                if (posX_3 <= 40) {
                    dir_3 = UP_3;
                }
            }
        } else if (current_3.equals("S17-1")) {
            if (prev_3.equals("S13-1")) {
                dir_3 = RIGHT_3;
                if (posX_3 >= 650) {
                    dir_3 = DOWN_3;
                }
            }
        } else if (current_3.equals("S18-1")) {
            if (prev_3.equals("S12-1") || prev_3.equals("S13-1") || prev_3.equals("S14-1")) {
                dir_3 = RIGHT_3;
            } else if (prev_3.equals("S19-1") || prev_3.equals("S19-2")) {
                dir_3 = LEFT_3;
            }
        } else if (current_3.equals("S19-1")) {
            if (prev_3.equals("S18-1")) {
                dir_3 = RIGHT_3;
            } else if (prev_3.equals("S20-1")) {
                dir_3 = LEFT_3;
            }
        } else if (current_3.equals("S19-2")) {
            if (prev_3.equals("S18-1")) {
                dir_3 = CROSS_RIGHT_3;
                if (posX_3 >= 400 || posY_3 >= 400) {
                    dir_3 = RIGHT_3;
                }
                if (posX_3 >= 500) {
                    dir_3 = CROSS_RIGHT_UP_3;
                }
            }
            if (prev_3.equals("S20-1")) {
                dir_3 = CROSS_LEFT_3;
                if (posX_3 <= 550 || posY_3 >= 400) {
                    dir_3 = LEFT_3;
                }
                if (posX_3 <= 400) {
                    dir_3 = CROSS_LEFT_UP_3;
                }
            }
        } else if (current_3.equals("S20-1")) {
            if (prev_3.equals("S19-1")) {
                dir_3 = RIGHT_3;
                if (posX_3 >= 620) {
                    dir_3 = DOWN_3;
                }
            } else if (prev_3.equals("S19-2")) {
                dir_3 = CROSS_RIGHT_UP_3;
                if (posY_3 <= 350) {
                    dir_3 = RIGHT_3;
                }
                if (posX_3 >= 620) {
                    dir_3 = DOWN_3;
                }
            } else if (prev_3.equals("S21-1")) {
                dir_3 = UP_3;
                if (posY_3 <= 350) {
                    dir_3 = LEFT_3;
                }
            }
        } else if (current_3.equals("S21-1")) {
            if (prev_3.equals("S20-1")) {
                dir_3 = DOWN_3;
                if (posY_3 >= 470) {
                    dir_3 = LEFT_3;
                }
            } else if (prev_3.equals("S22-1") || prev_3.equals("S22-2")) {
                dir_3 = RIGHT_3;
                if (posX_3 >= 600) {
                    dir_3 = UP_3;
                }
            }
        } else if (current_3.equals("S22-1")) {
            if (prev_3.equals("S21-1")) {
                dir_3 = CROSS_LEFT_UP_3;
                if (posX_3 <= 550 || posY_3 <= 420) {
                    dir_3 = LEFT_3;
                }
                if (posX_3 <= 450) {
                    dir_3 = CROSS_LEFT_3;
                }
            } else if (prev_3.equals("S23-1")) {
                dir_3 = CROSS_RIGHT_UP_3;
                if (posX_3 >= 450 || posY_3 <= 420) {
                    dir_3 = RIGHT_3;
                }
                if (posX_3 >= 550) {
                    dir_3 = CROSS_RIGHT_3;
                }
            }
        } else if (current_3.equals("S22-2")) {
            if (prev_3.equals("S21-1")) {
                dir_3 = LEFT_3;
            } else if (prev_3.equals("S23-1")) {
                dir_3 = RIGHT_3;
            }
        } else if (current_3.equals("S23-1")) {
            if (prev_3.equals("S22-1") || prev_3.equals("S22-2")) {
                dir_3 = LEFT_3;
            } else if (prev_3.equals("S24-1") || prev_3.equals("S25-1")) {
                dir_3 = RIGHT_3;
            }
        } else if (current_3.equals("S24-1")) {
            if (prev_3.equals("S23-1")) {
                dir_3 = CROSS_LEFT_3;
                if (posX_3 <= 300 || posY_3 >= 520) {
                    dir_3 = LEFT_3;
                }
            } else if (prev_3.equals("S25-2") || prev_3.equals("S25-3")) {
                dir_3 = RIGHT_3;
                if (posX_3 >= 300) {
                    dir_3 = CROSS_RIGHT_UP_3;
                }
            }
        } else if (current_3.equals("S25-1")) {
            if (prev_3.equals("S23-1")) {
                dir_3 = LEFT_3;
            }
        } else if (current_3.equals("S25-2")) {
            if (prev_3.equals("S24-1")) {
                dir_3 = LEFT_3;
            } else if (prev_3.equals("S26-1")) {
                dir_3 = RIGHT_3;
            }
        } else if (current_3.equals("S25-3")) {
            if (prev_3.equals("S24-1")) {
                dir_3 = CROSS_LEFT_3;
                if (posX_3 <= 250 || posY_3 >= 550) {
                    dir_3 = LEFT_3;
                }
                if (posX_3 <= 100) {
                    dir_3 = CROSS_LEFT_UP_3;
                }
            } else if (prev_3.equals("S26-1")) {
                dir_3 = CROSS_RIGHT_3;
                if (posX_3 >= 100 || posY_3 >= 550) {
                    dir_3 = RIGHT_3;
                }
                if (posX_3 >= 250) {
                    dir_3 = CROSS_RIGHT_UP_3;
                }
            }
        } else if (current_3.equals("S26-1")) {
            if (prev_3.equals("S25-2") || prev_3.equals("S25-3")) {
                dir_3 = LEFT_3;
                if (posX_3 <= 50 || posY_3 >= 550) {
                    dir_3 = DOWN_3;
                }
                if (posY_3 >= 650) {
                    dir_3 = RIGHT_3;
                }
            } else if (prev_3.equals("S27-1")) {
                dir_3 = LEFT_3;
                if (posX_3 <= 50 && posY_3 > 520) {
                    dir_3 = UP_3;
                }
                if (posY_3 <= 520) {
                    dir_3 = RIGHT_3;
                }
            }
        } else if (current_3.equals("S27-1")) {
            if (prev_3.equals("S26-1")) {
                dir_3 = RIGHT_3;
            } else if (prev_3.equals("S28-1")) {
                dir_3 = LEFT_3;
            }
        } else if (current_3.equals("S28-1")) {
            if (prev_3.equals("S27-1")) {
                dir_3 = RIGHT_3;
            } else {
                dir_3 = LEFT_3;
            }
        } else if (current_3.equals("S29-1")) {
            if (prev_3 == null) {
                dir_3 = LEFT_3;
            } else if (prev_3.equals("S28-1")) {
                dir_3 = RIGHT_3;
            }
        } else if (current_3.equals("S29-2")) {
            if (prev_3.equals("S28-1")) {
                dir_3 = CROSS_RIGHT_3;
                if (posX_3 >= 500 || posY_3 >= 630) {
                    dir_3 = RIGHT_3;
                }
            } else {
                dir_3 = LEFT_3;
                if (posX_3 <= 500) {
                    dir_3 = CROSS_LEFT_UP_3;
                }
            }
        }
    }

    private void moveIt_3() {

        while (flag_scheduling) {
            System.out.println(" ");
        }
        while (moveit) {

            if (((int) posY_3) == 351) {
                while (CriticalSection) {
                    System.out.println(" ");
                }
            }
            if (speed_3 != 0) {

                TableModel.setValueAt("Melrose", 2, 1);
                TableModel.setValueAt("Boston", 2, 2);
                TableModel.setValueAt(2, 2, 3);
                TableModel.setValueAt((int) (speed_3 * 100), 2, 4);
                TableModel.setValueAt(current_3, 2, 5);

                if (!flag_3) {
                    if ((posX_3 >= 600 && posX_3 <= 610) && current_3.equals("S5-2")) {
                        if (picked_stations_3.contains("Alewife")) {
                            if ((b2r_3 == 1 && visited_3.get("Alewife") == 0) || (b2r_3 == 0 && visited_3.get("Alewife") == 1)) {
                                speed_3 = 0;
                                flag_3 = true;
                                startTime_3 = System.currentTimeMillis();
                                System.out.println("Waiting at Alewife station");
                                if (b2r_3 == 1) {
                                    visited_3.put("Alewife", 1);
                                } else {
                                    visited_3.put("Alewife", 2);
                                }
                                continue;
                            }

                        }
                    } else if ((posX_3 >= 600 && posX_3 <= 610) && current_3.equals("S5-1")) {
                        if (picked_stations_3.contains("Alewife")) {
                            if ((b2r_3 == 1 && visited_3.get("Alewife") == 0) || (b2r_3 == 0 && visited_3.get("Alewife") == 1)) {
                                speed_3 = 0;
                                flag_3 = true;
                                startTime_3 = System.currentTimeMillis();
                                System.out.println("Waiting at Alewife station");
                                if (b2r_3 == 1) {
                                    visited_3.put("Alewife", 1);
                                } else {
                                    visited_3.put("Alewife", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_3 >= 150 && posX_3 <= 160) && current_3.equals("S10-1")) {
                        if (picked_stations_3.contains("Medford")) {
                            if ((b2r_3 == 1 && visited_3.get("Medford") == 0) || (b2r_3 == 0 && visited_3.get("Medford") == 1)) {
                                speed_3 = 0;
                                flag_3 = true;
                                startTime_3 = System.currentTimeMillis();
                                System.out.println("Waiting at Medford station");
                                if (b2r_3 == 1) {
                                    visited_3.put("Medford", 1);
                                } else {
                                    visited_3.put("Medford", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_3 >= 150 && posX_3 <= 160) && current_3.equals("S10-2")) {
                        if (picked_stations_3.contains("Medford")) {
                            if ((b2r_3 == 1 && visited_3.get("Medford") == 0) || (b2r_3 == 0 && visited_3.get("Medford") == 1)) {
                                speed_3 = 0;
                                flag_3 = true;
                                startTime_3 = System.currentTimeMillis();
                                System.out.println("Waiting at Medford station");
                                if (b2r_3 == 1) {
                                    visited_3.put("Medford", 1);
                                } else {
                                    visited_3.put("Medford", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_3 >= 410 && posX_3 <= 420) && current_3.equals("S19-1")) {
                        if (picked_stations_3.contains("Melrose")) {
                            if ((b2r_3 == 1 && visited_3.get("Melrose") == 0) || (b2r_3 == 0 && visited_3.get("Melrose") == 1)) {
                                speed_3 = 0;
                                flag_3 = true;
                                startTime_3 = System.currentTimeMillis();
                                System.out.println("Waiting at Melrose station");
                                if (b2r_3 == 1) {
                                    visited_3.put("Melrose", 1);
                                } else {
                                    visited_3.put("Melrose", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_3 >= 410 && posX_3 <= 420) && current_3.equals("S19-2")) {
                        if (picked_stations_3.contains("Melrose")) {
                            if ((b2r_3 == 1 && visited_3.get("Melrose") == 0) || (b2r_3 == 0 && visited_3.get("Melrose") == 1)) {
                                speed_3 = 0;
                                flag_3 = true;
                                startTime_3 = System.currentTimeMillis();
                                System.out.println("Waiting at Melrose station");
                                if (b2r_3 == 1) {
                                    visited_3.put("Melrose", 1);
                                } else {
                                    visited_3.put("Melrose", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_3 >= 110 && posX_3 <= 120) && current_3.equals("S25-2")) {
                        if (picked_stations_3.contains("Stoneham")) {
                            if ((b2r_3 == 1 && visited_3.get("Stoneham") == 0) || (b2r_3 == 0 && visited_3.get("Stoneham") == 1)) {
                                speed_3 = 0;
                                flag_3 = true;
                                startTime_3 = System.currentTimeMillis();
                                System.out.println("Waiting at Stoneham station");
                                if (b2r_3 == 1) {
                                    visited_3.put("Stoneham", 1);
                                } else {
                                    visited_3.put("Stoneham", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_3 >= 110 && posX_3 <= 120) && current_3.equals("S25-3")) {
                        if (picked_stations_3.contains("Stoneham")) {
                            if ((b2r_3 == 1 && visited_3.get("Stoneham") == 0) || (b2r_3 == 0 && visited_3.get("Stoneham") == 1)) {
                                speed_3 = 0;
                                flag_3 = true;
                                startTime_3 = System.currentTimeMillis();
                                System.out.println("Waiting at Stoneham station");
                                if (b2r_3 == 1) {
                                    visited_3.put("Stoneham", 1);
                                } else {
                                    visited_3.put("Stoneham", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_3 >= 510 && posX_3 <= 520) && current_3.equals("S29-1")) {
                        if (picked_stations_3.contains("Reading")) {
                            if ((b2r_3 == 1 && visited_3.get("Reading") == 0) || (b2r_3 == 0 && visited_3.get("Reading") == 1)) {
                                speed_3 = 0;
                                flag_3 = true;
                                startTime_3 = System.currentTimeMillis();
                                System.out.println("Waiting at Reading station");
                                if (b2r_3 == 1) {
                                    visited_3.put("Reading", 1);
                                } else {
                                    visited_3.put("Reading", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_3 >= 510 && posX_3 <= 520) && current_3.equals("S29-2")) {
                        if (picked_stations_3.contains("Reading")) {
                            if ((b2r_3 == 1 && visited_3.get("Reading") == 0) || (b2r_3 == 0 && visited_3.get("Reading") == 1)) {
                                speed_3 = 0;
                                flag_3 = true;
                                startTime_3 = System.currentTimeMillis();
                                System.out.println("Waiting at Reading station");
                                if (b2r_3 == 1) {
                                    visited_3.put("Reading", 1);
                                } else {
                                    visited_3.put("Reading", 2);
                                }
                                continue;
                            }
                        }
                    }
                }

                /*System.out.println(posX + " " + posY + " " + nextStop + " DIR: " + dir);
				System.out.println(current + " " + next_section);
				System.out.println(next);*/
                if (dir_3 == RIGHT_3) {
                    posX_3 += speed_3;
                    if (posX_3 >= nextStop_3.x) {
                        // posX = nextStop.x;
                        if (!next_3.isEmpty()) {
                            nextStop_3 = next_3.poll();
                        } else {
                            updateNext_3();
                        }
                        updateDir_3();
                    }
                } else if (dir_3 == LEFT_3) {
                    posX_3 -= speed_3;
                    if (posX_3 <= nextStop_3.x) {
                        // posX = nextStop.x;
                        if (!next_3.isEmpty()) {
                            nextStop_3 = next_3.poll();
                        } else {
                            updateNext_3();
                        }
                        updateDir_3();
                    }
                } else if (dir_3 == UP_3) {
                    posY_3 -= speed_3;
                    if (posY_3 <= nextStop_3.y) {
                        // posY = nextStop.y;
                        if (!next_3.isEmpty()) {
                            nextStop_3 = next_3.poll();
                        } else {
                            updateNext_3();
                        }
                        updateDir_3();
                    }
                } else if (dir_3 == DOWN_3) {
                    posY_3 += speed_3;
                    if (posY_3 >= nextStop_3.y) {
                        // posY = nextStop.y;
                        if (!next_3.isEmpty()) {
                            nextStop_3 = next_3.poll();
                        } else {
                            updateNext_3();
                        }
                        updateDir_3();
                    }
                } else if (dir_3 == CROSS_RIGHT_3) {
                    posX_3 += speed_3;
                    posY_3 += speed_3;
                    if (posY_3 >= nextStop_3.y || posX_3 >= nextStop_3.x) {
                        // posY = nextStop.y;
                        if (!next_3.isEmpty()) {
                            nextStop_3 = next_3.poll();
                        } else {
                            updateNext_3();
                        }
                        updateDir_3();
                    }
                } else if (dir_3 == CROSS_LEFT_3) {
                    posX_3 -= speed_3;
                    posY_3 += speed_3;
                    if (posY_3 >= nextStop_3.y || posX_3 <= nextStop_3.x) {
                        // posY = nextStop.y;
                        if (!next_3.isEmpty()) {
                            nextStop_3 = next_3.poll();
                        } else {
                            updateNext_3();
                        }
                        updateDir_3();
                    }
                } else if (dir_3 == CROSS_LEFT_UP_3) {
                    posX_3 -= speed_3;
                    posY_3 -= speed_3;
                    if (posY_3 <= nextStop_3.y || posX_3 <= nextStop_3.x) {
                        // posY = nextStop.y;
                        if (!next_3.isEmpty()) {
                            nextStop_3 = next_3.poll();
                        } else {
                            updateNext_3();
                        }
                        updateDir_3();
                    }
                } else if (dir_3 == CROSS_RIGHT_UP_3) {
                    posX_3 += speed_3;
                    posY_3 -= speed_3;
                    if (posY_3 <= nextStop_3.y || posX_3 >= nextStop_3.x) {
                        // posY = nextStop.y;
                        if (!next_3.isEmpty()) {
                            nextStop_3 = next_3.poll();
                        } else {
                            updateNext_3();
                        }
                        updateDir_3();
                    }
                }
            } else if (flag_3) {
                if (System.currentTimeMillis() - startTime_3 >= 2000) {
                    flag_3 = false;
                    System.out.println("Leaving station");
                    speed_3 = speedLimit_3.get(current_3) / 100.0;
                }
            }
            try {
                Thread.sleep(10);
            } catch (Exception exc) {
            }
            frame.repaint();
        }
    }

    private void readTrackdb_4() {
        try {
            File file = new File("trackdb.txt");
            Scanner in = new Scanner(file);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] tokens = line.trim().split(" ");
                if (tokens[0].contains("SW")) {
                    String[] vals = tokens[1].trim().split(",");
                    int x = Integer.valueOf(vals[0]);
                    int y = Integer.valueOf(vals[1]);
                    Point p = new Point(x, y);
                    switches_4.put(tokens[0], p);
                } else {
                    String[] vals = tokens[1].trim().split(";");
                    ArrayList<Point> points = new ArrayList<>();
                    for (int i = 0; i < vals.length; ++i) {
                        String[] vals2 = vals[i].trim().split(",");
                        int x = Integer.valueOf(vals2[0]);
                        int y = Integer.valueOf(vals2[1]);
                        Point p = new Point(x, y);
                        points.add(p);
                    }
                    int speed = Integer.valueOf(tokens[2].trim());
                    sections_4.put(tokens[0], points);
                    speedLimit_4.put(tokens[0], speed);
                }
            }
            in.close();
            in = new Scanner(new File("route5.txt"));
            while (in.hasNextLine()) {
                route_4 = in.nextLine().trim().split(" ");
            }
            in.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        prev_4 = null;
    }

    private void updateNext_4() {
        String key;
        if (b2r_4 == 1) {
            /*if (location + 1 < route.length && picked_stations.contains(sec2sta.get(route[location+1])) && visited.get(sec2sta.get(route[location+1])) == 0) {
				speed = 0;
				flag = true;
				startTime = System.currentTimeMillis();
				visited.put(sec2sta.get(route[location+1]), 1);
				System.out.println("Waiting at station: " + sec2sta.get(route[location+1]));
				return;
				long time = System.currentTimeMillis();
				while(System.currentTimeMillis() - time <= 2000);
			}*/
            location_4++;
            if (location_4 >= route_4.length) {
                speed_4 = 0;
                b2r_4 = 0;
                prev_4 = null;
                return;
            }
            key = route_4[location_4];
            prev_4 = current_4;
            current_4 = key;
            speed_4 = speedLimit_4.get(current_4) / 100.0;
            if (location_4 + 1 < route_4.length) {
                next_section_4 = route_4[location_4 + 1];
            } else {
                next_section_4 = key;
            }
        } else {
            location_4--;
            if (location_4 < 0) {
                speed_4 = 0;
                b2r_4 = 1;
                prev_4 = null;
                return;
            }
            key = route_4[location_4];
            prev_4 = current_4;
            current_4 = key;
            speed_4 = speedLimit_4.get(current_4) / 100.0;
            if (location_4 - 1 >= 0) {
                next_section_4 = route_4[location_4 - 1];
            } else {
                next_section_4 = key;
            }
        }

        ArrayList<Point> tempPoints = sections_4.get(key);
        for (int i = 0; i < tempPoints.size(); ++i) {
            if (b2r_4 == 1) {
                next_4.add(tempPoints.get(i));
            } else {
                next_4.add(tempPoints.get(tempPoints.size() - i - 1));
            }
        }
        //System.out.println("Inside update: " + current + " " + next_section);
    }

    private void updateDir_4() {

        if (current_4.equals("S2-1")) {
            if (prev_4.equals("S1-1")) {
                dir_4 = RIGHT_4;
            } else if (prev_4.equals("S3-1")) {
                dir_4 = LEFT_4;
            }
        } else if (current_4.equals("S3-1")) {
            if (prev_4.equals("S2-1")) {
                dir_4 = RIGHT_4;
            } else if (prev_4.equals("S4-2")) {
                dir_4 = CROSS_LEFT_UP_4;
                if (posY_4 <= 50) {
                    dir_4 = LEFT_4;
                }
            } else if (prev_4.equals("S4-1")) {
                dir_4 = LEFT_4;
            }
        } else if (current_4.equals("S4-1")) {
            if (prev_4.equals("S3-1")) {
                dir_4 = RIGHT_4;
            } else if (prev_4.equals("S5-2")) {
                dir_4 = CROSS_LEFT_UP_4;
                if (posY_4 <= 50) {
                    dir_4 = LEFT_4;
                }
            } else if (prev_4.equals("S5-1")) {
                dir_4 = LEFT_4;
            }
        } else if (current_4.equals("S4-2")) {
            if (prev_4.equals("S3-1")) {
                dir_4 = CROSS_RIGHT_4;
                if (posX_4 >= 450 || posY_4 >= 100) {
                    dir_4 = RIGHT_4;
                }
            } else if (prev_4.equals("S6-2")) {
                dir_4 = LEFT_4;
            } else if (prev_4.equals("S3-2")) {
                dir_4 = RIGHT_4;
            }
        } else if (current_4.equals("S5-1")) {
            if (prev_4.equals("S4-1")) {
                dir_4 = RIGHT_4;
            } else if (prev_4.equals("S6-1")) {
                dir_4 = LEFT_4;
            } else if (prev_4.equals("S4-2")) {
                dir_4 = CROSS_RIGHT_UP_4;
                if (posY_4 <= 50) {
                    dir_4 = RIGHT_4;
                }

            }
        } else if (current_4.equals("S5-2")) {
            if (prev_4.equals("S4-1")) {
                dir_4 = CROSS_RIGHT_4;
                if (posX_4 >= 550 || posY_4 >= 100) {
                    dir_4 = RIGHT_4;
                }
            } else if (prev_4.equals("S6-2")) {
                dir_4 = LEFT_4;
            } else if (prev_4.equals("S4-2")) {
                dir_4 = RIGHT_4;
            }
        } else if (current_4.equals("S6-1")) {
            if (prev_4.equals("S5-1")) {
                dir_4 = RIGHT_4;
                if (posX_4 >= 650) {
                    dir_4 = DOWN_4;
                }
            } else if (prev_4.equals("S7-1")) {
                dir_4 = UP_4;
                if (posY_4 <= 45) {
                    dir_4 = LEFT_4;
                }
            }
        } else if (current_4.equals("S6-2")) {
            if (prev_4.equals("S5-2")) {
                dir_4 = DOWN_4;
                if (posX_4 >= 620 && posY_4 >= 180) {
                    dir_4 = CROSS_RIGHT_4;
                }
            } else if (prev_4.equals("S7-1")) {
                dir_4 = CROSS_LEFT_UP_4;
                if (posX_4 <= 620 || posY_4 <= 180) {
                    dir_4 = UP_4;
                }
            }
        } else if (current_4.equals("S7-1")) {
            if (prev_4.equals("S6-1") || prev_4.equals("S6-2")) {
                dir_4 = DOWN_4;
                if (posY_4 >= 250) {
                    dir_4 = LEFT_4;
                }
            } else if (prev_4.equals("S8-1") || prev_4.equals("S8-2")) {
                dir_4 = RIGHT_4;
                if (posX_4 >= 640) {
                    dir_4 = UP_4;
                }
            }
        } else if (current_4.equals("S8-1")) {
            if (prev_4.equals("S7-1")) {
                dir_4 = CROSS_LEFT_UP_4;
                if (posY_4 <= 200 || posX_4 <= 550) {
                    dir_4 = LEFT_4;
                }
                if (posX_4 <= 400) {
                    dir_4 = CROSS_LEFT_4;
                }
            } else if (prev_4.equals("S9-1")) {
                dir_4 = CROSS_RIGHT_UP_4;
                if (posY_4 <= 200 || posX_4 >= 400) {
                    dir_4 = RIGHT_4;
                }
                if (posX_4 >= 550) {
                    dir_4 = CROSS_RIGHT_4;
                }
            }

        } else if (current_4.equals("S8-2")) {
            if (prev_4.equals("S7-1")) {
                dir_4 = LEFT_4;
            } else if (prev_4.equals("S9-1")) {
                dir_4 = RIGHT_4;
            }
        } else if (current_4.equals("S9-1")) {
            if (prev_4.equals("S8-1") || prev_4.equals("S8-2")) {
                dir_4 = LEFT_4;
            } else if (prev_4.equals("S10-1") || prev_4.equals("S10-2")) {
                dir_4 = RIGHT_4;
            }
        } else if (current_4.equals("S10-1")) {
            if (prev_4.equals("S9-1")) {
                dir_4 = LEFT_4;
            } else if (prev_4.equals("S11-1")) {
                dir_4 = RIGHT_4;
            }
        } else if (current_4.equals("S10-2")) {
            if (prev_4.equals("S9-1")) {
                dir_4 = CROSS_LEFT_4;
                if (posY_4 >= 300 || posX_4 <= 250) {
                    dir_4 = LEFT_4;
                }
                if (posX_4 <= 100) {
                    dir_4 = CROSS_LEFT_UP_4;
                }
            } else if (prev_4.equals("S11-1")) {
                dir_4 = CROSS_RIGHT_4;
                if (posY_4 >= 300 || posX_4 >= 100) {
                    dir_4 = RIGHT_4;
                }
                if (posX_4 >= 250) {
                    dir_4 = CROSS_RIGHT_UP_4;
                }
            }
        } else if (current_4.equals("S11-1")) {
            if (prev_4.equals("S10-1") || prev_4.equals("S10-2")) {
                dir_4 = LEFT_4;
                if (posX_4 <= 40) {
                    dir_4 = DOWN_4;
                }
            } else if (prev_4.equals("S12-1")) {
                dir_4 = UP_4;
                if (posY_4 <= 250) {
                    dir_4 = RIGHT_4;
                }
            }
        } else if (current_4.equals("S12-1")) {
            if (prev_4.equals("S11-1")) {
                dir_4 = RIGHT_4;
            } else if (prev_4.equals("S18-1")) {
                dir_4 = LEFT_4;
            }
        } else if (current_4.equals("S13-1")) {
            if (prev_4.equals("S12-1") || prev_4.equals("S14-1")) {
                dir_4 = CROSS_RIGHT_4;
                if (posX_4 >= 400 || posY_4 <= 300) {
                    dir_4 = RIGHT_4;
                }
            }
        } else if (current_4.equals("S16-1")) {
            if (prev_4.equals("S17-1")) {
                dir_4 = DOWN_4;
                if (posY_4 >= 650) {
                    dir_4 = LEFT_4;
                }
                if (posX_4 <= 40) {
                    dir_4 = UP_4;
                }
            }
        } else if (current_4.equals("S17-1")) {
            if (prev_4.equals("S13-1")) {
                dir_4 = RIGHT_4;
                if (posX_4 >= 650) {
                    dir_4 = DOWN_4;
                }
            }
        } else if (current_4.equals("S18-1")) {
            if (prev_4.equals("S12-1") || prev_4.equals("S13-1") || prev_4.equals("S14-1")) {
                dir_4 = RIGHT_4;
            } else if (prev_4.equals("S19-1") || prev_4.equals("S19-2")) {
                dir_4 = LEFT_4;
            }
        } else if (current_4.equals("S19-1")) {
            if (prev_4.equals("S18-1")) {
                dir_4 = RIGHT_4;
            } else if (prev_4.equals("S20-1")) {
                dir_4 = LEFT_4;
            }
        } else if (current_4.equals("S19-2")) {
            if (prev_4.equals("S18-1")) {
                dir_4 = CROSS_RIGHT_4;
                if (posX_4 >= 400 || posY_4 >= 400) {
                    dir_4 = RIGHT_4;
                }
                if (posX_4 >= 500) {
                    dir_4 = CROSS_RIGHT_UP_4;
                }
            }
            if (prev_4.equals("S20-1")) {
                dir_4 = CROSS_LEFT_4;
                if (posX_4 <= 550 || posY_4 >= 400) {
                    dir_4 = LEFT_4;
                }
                if (posX_4 <= 400) {
                    dir_4 = CROSS_LEFT_UP_4;
                }
            }
        } else if (current_4.equals("S20-1")) {
            if (prev_4.equals("S19-1")) {
                dir_4 = RIGHT_4;
                if (posX_4 >= 620) {
                    dir_4 = DOWN_4;
                }
            } else if (prev_4.equals("S19-2")) {
                dir_4 = CROSS_RIGHT_UP_4;
                if (posY_4 <= 350) {
                    dir_4 = RIGHT_4;
                }
                if (posX_4 >= 620) {
                    dir_4 = DOWN_4;
                }
            } else if (prev_4.equals("S21-1")) {
                dir_4 = UP_4;
                if (posY_4 <= 350) {
                    dir_4 = LEFT_4;
                }
            }
        } else if (current_4.equals("S21-1")) {
            if (prev_4.equals("S20-1")) {
                dir_4 = DOWN_4;
                if (posY_4 >= 470) {
                    dir_4 = LEFT_4;
                }
            } else if (prev_4.equals("S22-1") || prev_4.equals("S22-2")) {
                dir_4 = RIGHT_4;
                if (posX_4 >= 600) {
                    dir_4 = UP_4;
                }
            }
        } else if (current_4.equals("S22-1")) {
            if (prev_4.equals("S21-1")) {
                dir_4 = CROSS_LEFT_UP_4;
                if (posX_4 <= 550 || posY_4 <= 420) {
                    dir_4 = LEFT_4;
                }
                if (posX_4 <= 450) {
                    dir_4 = CROSS_LEFT_4;
                }
            } else if (prev_4.equals("S23-1")) {
                dir_4 = CROSS_RIGHT_UP_4;
                if (posX_4 >= 450 || posY_4 <= 420) {
                    dir_4 = RIGHT_4;
                }
                if (posX_4 >= 550) {
                    dir_4 = CROSS_RIGHT_4;
                }
            }
        } else if (current_4.equals("S22-2")) {
            if (prev_4.equals("S21-1")) {
                dir_4 = LEFT_4;
            } else if (prev_4.equals("S23-1")) {
                dir_4 = RIGHT_4;
            }
        } else if (current_4.equals("S23-1")) {
            if (prev_4.equals("S22-1") || prev_4.equals("S22-2")) {
                dir_4 = LEFT_4;
            } else if (prev_4.equals("S24-1") || prev_4.equals("S25-1")) {
                dir_4 = RIGHT_4;
            }
        } else if (current_4.equals("S24-1")) {
//            System.out.println("prev_4   " +prev_4);
            if (prev_4.equals("S23-1")) {
                dir_4 = CROSS_LEFT_4;
                if (posX_4 <= 300 || posY_4 >= 520) {
                    dir_4 = LEFT_4;
                }
            } else if (prev_4.equals("S25-2") || prev_4.equals("S25-3")) {
                dir_4 = RIGHT_4;
                if (posX_4 >= 300) {
                    dir_4 = CROSS_RIGHT_UP_4;
                }
            }
            else if(prev_4.equals("S25-1")){
                dir_4 = CROSS_RIGHT_4;
            }
        } else if (current_4.equals("S25-1")) {
            if (prev_4.equals("S23-1")) {
                dir_4 = LEFT_4;
            }
            else if(prev_4.equals("S23-1")){
                dir_4 = RIGHT_4;
            }
        } else if (current_4.equals("S25-2")) {
            if (prev_4.equals("S24-1")) {
                dir_4 = LEFT_4;
            } else if (prev_4.equals("S26-1")) {
                dir_4 = RIGHT_4;
            }
        } else if (current_4.equals("S25-3")) {
            if (prev_4.equals("S24-1")) {
                dir_4 = CROSS_LEFT_4;
                if (posX_4 <= 250 || posY_4 >= 550) {
                    dir_4 = LEFT_4;
                }
                if (posX_4 <= 100) {
                    dir_4 = CROSS_LEFT_UP_4;
                }
            } else if (prev_4.equals("S26-1")) {
                dir_4 = CROSS_RIGHT_4;
                if (posX_4 >= 100 || posY_4 >= 550) {
                    dir_4 = RIGHT_4;
                }
                if (posX_4 >= 250) {
                    dir_4 = CROSS_RIGHT_UP_4;
                }
            }
        } else if (current_4.equals("S26-1")) {
            if (prev_4.equals("S25-2") || prev_4.equals("S25-3")) {
                dir_4 = LEFT_4;
                if (posX_4 <= 50 || posY_4 >= 550) {
                    dir_4 = DOWN_4;
                }
                if (posY_4 >= 650) {
                    dir_4 = RIGHT_4;
                }
            } else if (prev_4.equals("S27-1")) {
                dir_4 = LEFT_4;
                if (posX_4 <= 50 && posY_4 > 520) {
                    dir_4 = UP_4;
                }
                if (posY_4 <= 520) {
                    dir_4 = RIGHT_4;
                }
            }
        } else if (current_4.equals("S27-1")) {
            if (prev_4.equals("S26-1")) {
                dir_4 = RIGHT_4;
            } else if (prev_4.equals("S28-1")) {
                dir_4 = LEFT_4;
            }
        } else if (current_4.equals("S28-1")) {
            if (prev_4.equals("S27-1")) {
                dir_4 = RIGHT_4;
            } else {
                dir_4 = LEFT_4;
            }
        } else if (current_4.equals("S29-1")) {
            if (prev_4 == null) {
                dir_4 = LEFT_4;
            } else if (prev_4.equals("S28-1")) {
                dir_4 = RIGHT_4;
            }
        } else if (current_4.equals("S29-2")) {
            if (prev_4.equals("S28-1")) {
                dir_4 = CROSS_RIGHT_4;
                if (posX_4 >= 500 || posY_4 >= 630) {
                    dir_4 = RIGHT_4;
                }
            } else {
                dir_4 = LEFT_4;
                if (posX_4 <= 500) {
                    dir_4 = CROSS_LEFT_UP_4;
                }
            }

        }

    }

    private void moveIt_4() {
        while (moveit) {
            if (((int) posY_4) == 351) {
                while (CriticalSection) {
                    System.out.println(" ");
                }
            }
            if (speed_4 != 0) {
                TableModel.setValueAt("Stoneham", 3, 1);
                TableModel.setValueAt("Reading", 3, 2);
                TableModel.setValueAt(1, 3, 3);
                TableModel.setValueAt((int) (speed_4 * 100), 3, 4);
                TableModel.setValueAt(current_4, 3, 5);

                if (!flag_4) {
                    if ((posX_4 >= 600 && posX_4 <= 610) && current_4.equals("S5-2")) {
                        if (picked_stations_4.contains("Alewife")) {
                            if ((b2r_4 == 1 && visited_4.get("Alewife") == 0) || (b2r_4 == 0 && visited_4.get("Alewife") == 1)) {
                                speed_4 = 0;
                                flag_4 = true;
                                startTime_4 = System.currentTimeMillis();
                                System.out.println("Waiting at Alewife station");
                                if (b2r_4 == 1) {
                                    visited_4.put("Alewife", 1);
                                } else {
                                    visited_4.put("Alewife", 2);
                                }
                                continue;
                            }

                        }
                    } else if ((posX_4 >= 600 && posX_4 <= 610) && current_4.equals("S5-1")) {
                        if (picked_stations_4.contains("Alewife")) {
                            if ((b2r_4 == 1 && visited_4.get("Alewife") == 0) || (b2r_4 == 0 && visited_4.get("Alewife") == 1)) {
                                speed_4 = 0;
                                flag_4 = true;
                                startTime_4 = System.currentTimeMillis();
                                System.out.println("Waiting at Alewife station");
                                if (b2r_4 == 1) {
                                    visited_4.put("Alewife", 1);
                                } else {
                                    visited_4.put("Alewife", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_4 >= 150 && posX_4 <= 160) && current_4.equals("S10-1")) {
                        if (picked_stations_4.contains("Medford")) {
                            if ((b2r_4 == 1 && visited_4.get("Medford") == 0) || (b2r_4 == 0 && visited_4.get("Medford") == 1)) {
                                speed_4 = 0;
                                flag_4 = true;
                                startTime_4 = System.currentTimeMillis();
                                System.out.println("Waiting at Medford station");
                                if (b2r_4 == 1) {
                                    visited_4.put("Medford", 1);
                                } else {
                                    visited_4.put("Medford", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_4 >= 150 && posX_4 <= 160) && current_4.equals("S10-2")) {
                        if (picked_stations_4.contains("Medford")) {
                            if ((b2r_4 == 1 && visited_4.get("Medford") == 0) || (b2r_4 == 0 && visited_4.get("Medford") == 1)) {
                                speed_4 = 0;
                                flag_4 = true;
                                startTime_4 = System.currentTimeMillis();
                                System.out.println("Waiting at Medford station");
                                if (b2r_4 == 1) {
                                    visited_4.put("Medford", 1);
                                } else {
                                    visited_4.put("Medford", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_4 >= 410 && posX_4 <= 420) && current_4.equals("S19-1")) {
                        if (picked_stations_4.contains("Melrose")) {
                            if ((b2r_4 == 1 && visited_4.get("Melrose") == 0) || (b2r_4 == 0 && visited_4.get("Melrose") == 1)) {
                                speed_4 = 0;
                                flag_4 = true;
                                startTime_4 = System.currentTimeMillis();
                                System.out.println("Waiting at Melrose station");
                                if (b2r_4 == 1) {
                                    visited_4.put("Melrose", 1);
                                } else {
                                    visited_4.put("Melrose", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_4 >= 410 && posX_4 <= 420) && current_4.equals("S19-2")) {
                        if (picked_stations_4.contains("Melrose")) {
                            if ((b2r_4 == 1 && visited_4.get("Melrose") == 0) || (b2r_4 == 0 && visited_4.get("Melrose") == 1)) {
                                speed_4 = 0;
                                flag_4 = true;
                                startTime_4 = System.currentTimeMillis();
                                System.out.println("Waiting at Melrose station");
                                if (b2r_4 == 1) {
                                    visited_4.put("Melrose", 1);
                                } else {
                                    visited_4.put("Melrose", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_4 >= 110 && posX_4 <= 120) && current_4.equals("S25-2")) {
                        if (picked_stations_4.contains("Stoneham")) {
                            if ((b2r_4 == 1 && visited_4.get("Stoneham") == 0) || (b2r_4 == 0 && visited_4.get("Stoneham") == 1)) {
                                speed_4 = 0;
                                flag_4 = true;
                                startTime_4 = System.currentTimeMillis();
                                System.out.println("Waiting at Stoneham station");
                                if (b2r_4 == 1) {
                                    visited_4.put("Stoneham", 1);
                                } else {
                                    visited_4.put("Stoneham", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_4 >= 110 && posX_4 <= 120) && current_4.equals("S25-3")) {
                        if (picked_stations_4.contains("Stoneham")) {
                            if ((b2r_4 == 1 && visited_4.get("Stoneham") == 0) || (b2r_4 == 0 && visited_4.get("Stoneham") == 1)) {
                                speed_4 = 0;
                                flag_4 = true;
                                startTime_4 = System.currentTimeMillis();
                                System.out.println("Waiting at Stoneham station");
                                if (b2r_4 == 1) {
                                    visited_4.put("Stoneham", 1);
                                } else {
                                    visited_4.put("Stoneham", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_4 >= 510 && posX_4 <= 520) && current_4.equals("S29-1")) {
                        if (picked_stations_4.contains("Reading")) {
                            if ((b2r_4 == 1 && visited_4.get("Reading") == 0) || (b2r_4 == 0 && visited_4.get("Reading") == 1)) {
                                speed_4 = 0;
                                flag_4 = true;
                                startTime_4 = System.currentTimeMillis();
                                System.out.println("Waiting at Reading station");
                                if (b2r_4 == 1) {
                                    visited_4.put("Reading", 1);
                                } else {
                                    visited_4.put("Reading", 2);
                                }
                                continue;
                            }
                        }
                    } else if ((posX_4 >= 510 && posX_4 <= 520) && current_4.equals("S29-2")) {
                        if (picked_stations_4.contains("Reading")) {
                            if ((b2r_4 == 1 && visited_4.get("Reading") == 0) || (b2r_4 == 0 && visited_4.get("Reading") == 1)) {
                                speed_4 = 0;
                                flag_4 = true;
                                startTime_4 = System.currentTimeMillis();
                                System.out.println("Waiting at Reading station");
                                if (b2r_4 == 1) {
                                    visited_4.put("Reading", 1);
                                } else {
                                    visited_4.put("Reading", 2);
                                }
                                continue;
                            }
                        }
                    }
                }

                /*System.out.println(posX + " " + posY + " " + nextStop + " DIR: " + dir);
				System.out.println(current + " " + next_section);
				System.out.println(next);*/
                if (dir_4 == RIGHT_4) {
                    posX_4 += speed_4;
                    if (posX_4 >= nextStop_4.x) {
                        // posX = nextStop.x;
                        if (!next_4.isEmpty()) {
                            nextStop_4 = next_4.poll();
                        } else {
                            updateNext_4();
                        }
                        updateDir_4();
                    }
                } else if (dir_4 == LEFT_4) {
                    posX_4 -= speed_4;
                    if (posX_4 <= nextStop_4.x) {
                        // posX = nextStop.x;
                        if (!next_4.isEmpty()) {
                            nextStop_4 = next_4.poll();
                        } else {
                            updateNext_4();
                        }
                        updateDir_4();
                    }
                } else if (dir_4 == UP_4) {
                    posY_4 -= speed_4;
                    if (posY_4 <= nextStop_4.y) {
                        // posY = nextStop.y;
                        if (!next_4.isEmpty()) {
                            nextStop_4 = next_4.poll();
                        } else {
                            updateNext_4();
                        }
                        updateDir_4();
                    }
                } else if (dir_4 == DOWN_4) {
                    posY_4 += speed_4;
                    if (posY_4 >= nextStop_4.y) {
                        // posY = nextStop.y;
                        if (!next_4.isEmpty()) {
                            nextStop_4 = next_4.poll();
                        } else {
                            updateNext_4();
                        }
                        updateDir_4();
                    }
                } else if (dir_4 == CROSS_RIGHT_4) {
                    posX_4 += speed_4;
                    posY_4 += speed_4;
                    if (posY_4 >= nextStop_4.y || posX_4 >= nextStop_4.x) {
                        // posY = nextStop.y;
                        if (!next_4.isEmpty()) {
                            nextStop_4 = next_4.poll();
                        } else {
                            updateNext_4();
                        }
                        updateDir_4();
                    }
                } else if (dir_4 == CROSS_LEFT_4) {
                    posX_4 -= speed_4;
                    posY_4 += speed_4;
                    if (posY_4 >= nextStop_4.y || posX_4 <= nextStop_4.x) {
                        // posY = nextStop.y;
                        if (!next_4.isEmpty()) {
                            nextStop_4 = next_4.poll();
                        } else {
                            updateNext_4();
                        }
                        updateDir_4();
                    }
                } else if (dir_4 == CROSS_LEFT_UP_4) {
                    posX_4 -= speed_4;
                    posY_4 -= speed_4;
                    if (posY_4 <= nextStop_4.y || posX_4 <= nextStop_4.x) {
                        // posY = nextStop.y;
                        if (!next_4.isEmpty()) {
                            nextStop_4 = next_4.poll();
                        } else {
                            updateNext_4();
                        }
                        updateDir_4();
                    }
                } else if (dir_4 == CROSS_RIGHT_UP_4) {
                    posX_4 += speed_4;
                    posY_4 -= speed_4;
                    if (posY_4 <= nextStop_4.y || posX_4 >= nextStop_4.x) {
                        // posY = nextStop.y;
                        if (!next_4.isEmpty()) {
                            nextStop_4 = next_4.poll();
                        } else {
                            updateNext_4();
                        }
                        updateDir_4();
                    }
                }
            } else if (flag_4) {
                if (System.currentTimeMillis() - startTime_4 >= 10000) {
                    flag_4 = false;
                    System.out.println("Leaving station");
                    speed_4 = speedLimit_4.get(current_4) / 100.0;
                }
            }
            try {
                Thread.sleep(10);
            } catch (Exception exc) {
            }
            frame.repaint();
        }
    }

    class Section {

        String id;
        boolean sw;
        String next, current, next1, prev1;
    }

    class Point {

        public int x, y;

        public Point(int x, int y) {
            // TODO Auto-generated constructor stub
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            String s = "x: " + x + " y: " + y;
            return s;
        }
    }
    boolean CriticalSection = false;

    private void frightmoveIt() {

//        System.out.println("freightX " + freightX);
//        System.out.println("freightY " + freightY);
        if (freightY >= 289 && freightY <= 370
                && freightX >= 319 && freightX <= 400) {
            CriticalSection = true;
        } else {
            CriticalSection = false;
        }

        if (fright) {
            freightX += fspeed;
            if (freightX > 640) {
                fright = false;
                fup = true;
            }
        }
        if (fup) {
            freightY -= fspeed;
            if (freightY < 290) {
                fup = false;
                fleft = true;
            }
        }
        if (fleft) {
            freightX -= fspeed;
            if (freightX < 25) {
                fleft = false;
                fdown = true;
            } else if (freightX < 300) {
                fdown = false;
            } else if (freightX < 400) {
                fdown = true;
            }
        }
        if (fdown) {
            freightY += fspeed;
            if (freightY > 670) {
                fdown = false;
                fright = true;
            }
        }
    }

    public void start_1() {
        if (!fileRead_1) {
            readTrackdb_1();
            fileRead_1 = true;
        }
        fspeed = 1;
        if (location_1 < 0) {
            location_1 = 0;
        }
        if (location_1 < route_1.length) {
            current_1 = route_1[location_1];
        }
        // updateNext();
        if (current_1.equals(route_1[0])) {
            readTrackdb_1();
            dir_1 = RIGHT_1;
            location_1 = 0;
            nextStop_1 = new Point(200, 50);
        } else if (current_1.equals(route_1[route_1.length - 1])) {
            location_1 = route_1.length - 1;
            nextStop_1 = new Point(450, 600);
        }
        if (b2r_1 == 1) {
            if (location_1 + 1 < route_1.length) {
                next_section_1 = route_1[location_1 + 1];
            }
        } else if (location_1 - 1 >= 0) {
            next_section_1 = route_1[location_1 - 1];
        }
        speed_1 = speedLimit_1.get(current_1) / 100.0;
    }

    public void start_2() {
        if (!fileRead_2) {
            readTrackdb_2();
            fileRead_2 = true;
        }
        fspeed = 1;
        if (location_2 < 0) {
            location_2 = 0;
        }
        if (location_2 < route_2.length) {
            current_2 = route_2[location_2];
        }
        // updateNext();
        if (current_2.equals(route_2[0])) {
            readTrackdb_2();
            dir_2 = RIGHT_2;
            location_2 = 0;
            nextStop_2 = new Point(200, 50);
        } else if (current_2.equals(route_2[route_2.length - 1])) {
            location_2 = route_2.length - 1;
            nextStop_2 = new Point(450, 600);
        }
        if (b2r_2 == 1) {
            if (location_2 + 1 < route_2.length) {
                next_section_2 = route_2[location_2 + 1];
            }
        } else if (location_2 - 1 >= 0) {
            next_section_2 = route_2[location_2 - 1];
        }
        speed_2 = speedLimit_2.get(current_2) / 100.0;
    }

    public void start_3() {
        if (!fileRead_3) {
            readTrackdb_3();
            fileRead_3 = true;
        }
        fspeed = 1;
        if (location_3 < 0) {
            location_3 = 0;
        }
        if (location_3 < route_3.length) {
            current_3 = route_3[location_3];
        }
        // updateNext();
        if (current_3.equals(route_3[0])) {
            readTrackdb_3();
            dir_3 = RIGHT_3;
            location_3 = 0;
            nextStop_3 = new Point(200, 50);
        } else if (current_3.equals(route_3[route_3.length - 1])) {
            location_3 = route_3.length - 1;
            nextStop_3 = new Point(450, 600);
        }
        if (b2r_3 == 1) {
            if (location_3 + 1 < route_3.length) {
                next_section_3 = route_3[location_3 + 1];
            }
        } else if (location_3 - 1 >= 0) {
            next_section_3 = route_3[location_3 - 1];
        }
        speed_3 = speedLimit_3.get(current_3) / 100.0;
    }

    public void start_4() {
        if (!fileRead_4) {
            readTrackdb_4();
            fileRead_4 = true;
        }
        fspeed = 1;
        if (location_4 < 0) {
            location_4 = 0;
        }
        if (location_4 < route_4.length) {
            current_4 = route_4[location_4];
        }
        // updateNext();
        if (current_4.equals(route_4[0])) {
            readTrackdb_4();
            dir_4 = RIGHT_4;
            location_4 = 0;
            nextStop_4 = new Point(200, 50);
        } else if (current_4.equals(route_4[route_4.length - 1])) {
            location_4 = route_4.length - 1;
            nextStop_4 = new Point(450, 600);
        }
        if (b2r_4 == 1) {
            if (location_4 + 1 < route_4.length) {
                next_section_4 = route_4[location_4 + 1];
            }
        } else if (location_4 - 1 >= 0) {
            next_section_4 = route_4[location_4 - 1];
        }
        speed_4 = speedLimit_4.get(current_4) / 100.0;
    }

    public void stopAll() {
        speed_4 = 0;
        speed_3 = 0;
        speed_2 = 0;
        speed_1 = 0;
        fspeed = 0;
    }

    public void ResetAll() {
        stopAll();
        moveit = false;

        init();
        RUN();
        // stopAllthread();

        TableModel.setValueAt("", 0, 1);
        TableModel.setValueAt("", 0, 2);
        TableModel.setValueAt("", 0, 3);
        TableModel.setValueAt("", 0, 4);
        TableModel.setValueAt("", 0, 5);

        TableModel.setValueAt("", 1, 1);
        TableModel.setValueAt("", 1, 2);
        TableModel.setValueAt("", 1, 3);
        TableModel.setValueAt("", 1, 4);
        TableModel.setValueAt("", 1, 5);

        TableModel.setValueAt("", 2, 1);
        TableModel.setValueAt("", 2, 2);
        TableModel.setValueAt("", 2, 3);
        TableModel.setValueAt("", 2, 4);
        TableModel.setValueAt("", 2, 5);

        TableModel.setValueAt("", 3, 1);
        TableModel.setValueAt("", 3, 2);
        TableModel.setValueAt("", 3, 3);
        TableModel.setValueAt("", 3, 4);
        TableModel.setValueAt("", 3, 5);

        //init();
        //RUN();
    }

    public void stopAllthread() {
        thread_1.suspend();
        thread_2.suspend();
        thread_3.suspend();
        thread_4.suspend();
    }
}
