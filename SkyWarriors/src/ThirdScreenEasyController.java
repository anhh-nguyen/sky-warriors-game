package the.SkyWarriors;
import javafx.animation.AnimationTimer;
import javafx.animation.PathTransition;
import javafx.animation.Transition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.PixelReader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.control.Button;
import java.awt.geom.Point2D;
import java.util.List;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.LineTo;
import javafx.animation.PathTransition.OrientationType;
import java.util.ArrayList;


import java.io.IOException;


public class ThirdScreenEasyController {
    /**
     * Gets org scene x.
     *
     * @return the org scene x
     */
    private double getOrgSceneX() {
        return orgSceneX;
    }

    /**
     * Sets org scene x.
     *
     * @param orgSceneX the org scene x
     */
    private void setOrgSceneX(double orgSceneX) {
        this.orgSceneX = orgSceneX;
    }

    /**
     * Gets org scene y.
     *
     * @return the org scene y
     */
    private double getOrgSceneY() {
        return orgSceneY;
    }

    /**
     * Sets org scene y.
     *
     * @param orgSceneY the org scene y
     */
    private void setOrgSceneY(double orgSceneY) {
        this.orgSceneY = orgSceneY;
    }

    /**
     * Gets org translate x.
     *
     * @return the org translate x
     */
    private double getOrgTranslateX() {
        return orgTranslateX;
    }

    /**
     * Sets org translate x.
     *
     * @param orgTranslateX the org translate x
     */
    private void setOrgTranslateX(double orgTranslateX) {
        this.orgTranslateX = orgTranslateX;
    }

    /**
     * Gets org translate y.
     *
     * @return the org translate y
     */
    private double getOrgTranslateY() {
        return orgTranslateY;
    }

    /**
     * Sets org translate y.
     *
     * @param orgTranslateY the org translate y
     */
    private void setOrgTranslateY(double orgTranslateY) {
        this.orgTranslateY = orgTranslateY;
    }

    /**
     * Gets upper left corner x.
     *
     * @return the upper left corner x
     */
    private int getUpperLeftCornerX() {
        return upperLeftCornerX;
    }

    /**
     * Sets upper left corner x.
     *
     * @param upperLeftCornerX the upper left corner x
     */
    private void setUpperLeftCornerX(int upperLeftCornerX) {
        this.upperLeftCornerX = upperLeftCornerX;
    }

    /**
     * Gets upper left corner y.
     *
     * @return the upper left corner y
     */
    private int getUpperLeftCornerY() {
        return upperLeftCornerY;
    }

    /**
     * Sets upper left corner y.
     *
     * @param upperLeftCornerY the upper left corner y
     */
    private void setUpperLeftCornerY(int upperLeftCornerY) {
        this.upperLeftCornerY = upperLeftCornerY;
    }

    /**
     * Gets upper right corner x.
     *
     * @return the upper right corner x
     */
    private int getUpperRightCornerX() {
        return upperRightCornerX;
    }

    /**
     * Sets upper right corner x.
     *
     * @param upperRightCornerX the upper right corner x
     */
    private void setUpperRightCornerX(int upperRightCornerX) {
        this.upperRightCornerX = upperRightCornerX;
    }

    /**
     * Gets upper right corner y.
     *
     * @return the upper right corner y
     */
    private int getUpperRightCornerY() {
        return upperRightCornerY;
    }

    /**
     * Sets upper right corner y.
     *
     * @param upperRightCornerY the upper right corner y
     */
    private void setUpperRightCornerY(int upperRightCornerY) {
        this.upperRightCornerY = upperRightCornerY;
    }

    /**
     * Gets lower left corner x.
     *
     * @return the lower left corner x
     */
    private int getLowerLeftCornerX() {
        return lowerLeftCornerX;
    }

    /**
     * Sets lower left corner x.
     *
     * @param lowerLeftCornerX the lower left corner x
     */
    private void setLowerLeftCornerX(int lowerLeftCornerX) {
        this.lowerLeftCornerX = lowerLeftCornerX;
    }

    /**
     * Gets lower left corner y.
     *
     * @return the lower left corner y
     */
    private int getLowerLeftCornerY() {
        return lowerLeftCornerY;
    }

    /**
     * Sets lower left corner y.
     *
     * @param lowerLeftCornerY the lower left corner y
     */
    private void setLowerLeftCornerY(int lowerLeftCornerY) {
        this.lowerLeftCornerY = lowerLeftCornerY;
    }

    /**
     * Gets lower right corner y.
     *
     * @return the lower right corner y
     */
    private int getLowerRightCornerY() {
        return lowerRightCornerY;
    }

    /**
     * Sets lower right corner y.
     *
     * @param lowerRightCornerY the lower right corner y
     */
    private void setLowerRightCornerY(int lowerRightCornerY) {
        this.lowerRightCornerY = lowerRightCornerY;
    }

    /**
     * Gets scene x int.
     *
     * @return the scene x int
     */
    private int getSceneXInt() {
        return sceneXInt;
    }

    /**
     * Sets scene x int.
     *
     * @param sceneXInt the scene x int
     */
    private void setSceneXInt(int sceneXInt) {
        this.sceneXInt = sceneXInt;
    }

    /**
     * Gets scene y int.
     *
     * @return the scene y int
     */
    private int getSceneYInt() {
        return sceneYInt;
    }

    /**
     * Sets scene y int.
     *
     * @param sceneYInt the scene y int
     */
    private void setSceneYInt(int sceneYInt) {
        this.sceneYInt = sceneYInt;
    }

    private double orgSceneX;
    private double orgSceneY;
    private double orgTranslateX;
    private double orgTranslateY;
    private int upperLeftCornerX;
    private int upperLeftCornerY;
    private int upperRightCornerX;
    private int upperRightCornerY;
    private int lowerLeftCornerX;
    private int lowerLeftCornerY;
    private ArrayList<Transition> transitions = new ArrayList<>();
    private ArrayList<Enemy> enemies = new ArrayList<>();
    @FXML
    private Group enemiesGroup;
    /**
     * Gets enemies Group
     *
     * @return the enemies Group
     */
    private Group getEnemiesGroup() {
        return enemiesGroup;
    }

    /**
     * Sets enemies Group
     *
     * @param enemiesGroup the enemies Group
     */
    private void setEnemies(Group enemiesGroup) {
        this.enemiesGroup = enemiesGroup;
    }

    /**
     * Gets transitions
     *
     * @return the transitions
     */
    private ArrayList<Transition> getTransitions() {
        return transitions;
    }

    /**
     * Sets transitions
     *
     * @param transitions the transitions
     */
    private void setTransitions(ArrayList<Transition> transitions) {
        this.transitions = transitions;
    }

    /**
     * Gets lower right corner x.
     *
     * @return the lower right corner x
     */
    private int getLowerRightCornerX() {
        return lowerRightCornerX;
    }

    /**
     * Sets lower right corner x.
     *
     * @param lowerRightCornerX the lower right corner x
     */
    private void setLowerRightCornerX(int lowerRightCornerX) {
        this.lowerRightCornerX = lowerRightCornerX;
    }

    /**
     * Gets the previous cost of purchased tower.
     *
     * @return the previous cost of purchased tower
     */
    private int getPreviousMoney() {
        return lowerRightCornerX;
    }

    /**
     * Sets the previous cost of purchased tower.
     *
     * @param previousMoney the previous cost of purchased tower
     */
    private void setPreviousMoney(int previousMoney) {
        this.previousMoney = previousMoney;
    }
    private int lowerRightCornerX;
    private int lowerRightCornerY;
    private int sceneXInt;
    private int sceneYInt;
    private int previousMoney;
    private int previousPrice;
    private ArrayList<Tower> towerList = new ArrayList<>();
    private AnimationTimer gameLoop;
    private Player player;

    @FXML
    private AnchorPane root;
    @FXML
    private Label health;
    @FXML
    private Label money;
    @FXML
    private Label damage11;
    @FXML
    private Label damage12;
    @FXML
    private Label damage13;
    @FXML
    private Label damage14;
    @FXML
    private Label damage15;
    @FXML
    private Pane tower1;
    @FXML
    private Pane tower2;
    @FXML
    private Pane tower3;
    @FXML
    private Button startCombat;
    @FXML
    private Button upgrade;
    @FXML
    private Pane towerOne;
    @FXML
    private Pane towerOne1;
    @FXML
    private Pane towerOne2;
    @FXML
    private Pane towerOne3;
    @FXML
    private Pane towerOne4;
    @FXML
    private Pane towerOne5;
    @FXML
    private Pane towerTwo;
    @FXML
    private Pane towerTwo1;
    @FXML
    private Pane towerTwo2;
    @FXML
    private Pane towerTwo3;
    @FXML
    private Pane towerTwo4;
    @FXML
    private Pane towerTwo5;
    @FXML
    private Pane towerThree;
    @FXML
    private Pane towerThree1;
    @FXML
    private Pane towerThree2;
    @FXML
    private Pane towerThree3;
    @FXML
    private Pane towerThree4;
    @FXML
    private Pane towerThree5;
    @FXML
    private Pane towerThree6;


    public void checkBounds() {
        if (upperLeftCornerX >= 824) {
            upperLeftCornerX = 824;
        }
        if (upperLeftCornerX < 0) {
            upperLeftCornerX = 0;
        }
        if (upperLeftCornerY >= 659) {
            upperLeftCornerY = 659;
        }
        if (upperLeftCornerY < 0) {
            upperLeftCornerY = 0;
        }
        if (upperRightCornerX >= 824) {
            upperRightCornerX = 824;
        }
        if (upperRightCornerX < 0) {
            upperRightCornerX = 0;
        }
        if (upperRightCornerY >= 659) {
            upperRightCornerY = 659;
        }
        if (upperRightCornerY < 0) {
            upperRightCornerY = 0;
        }
        if (lowerLeftCornerX >= 824) {
            lowerLeftCornerX = 824;
        }
        if (lowerLeftCornerX < 0) {
            lowerLeftCornerX = 0;
        }
        if (lowerLeftCornerY >= 659) {
            lowerLeftCornerY = 659;
        }
        if (lowerLeftCornerY < 0) {
            lowerLeftCornerY = 0;
        }
        if (lowerRightCornerX >= 824) {
            lowerRightCornerX = 824;
        }
        if (lowerRightCornerX < 0) {
            lowerRightCornerX = 0;
        }
        if (lowerRightCornerY >= 659) {
            lowerRightCornerY = 659;
        }
        if (lowerRightCornerY < 0) {
            lowerRightCornerY = 0;
        }
        if (sceneXInt >= 824) {
            sceneXInt = 824;
        }
        if (sceneXInt < 0) {
            sceneXInt = 0;
        }
        if (sceneYInt >= 659) {
            sceneYInt = 659;
        }
        if (sceneYInt < 0) {
            sceneYInt = 0;
        }
    }
    @FXML
    protected void upgradeBtn(ActionEvent upgradeEvent) {
        Node node = (Node) upgradeEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Player player = (Player) stage.getUserData();

        if (player.getMoney() > 50) {

            player.setMoney(player.getMoney() - 50);

            towerOne.getStyleClass().add("t1Upgrade");
            towerOne1.getStyleClass().add("t1Upgrade");
            towerOne2.getStyleClass().add("t1Upgrade");
            towerOne3.getStyleClass().add("t1Upgrade");
            towerOne4.getStyleClass().add("t1Upgrade");
            towerOne5.getStyleClass().add("t1Upgrade");
            towerTwo.getStyleClass().add("t2Upgrade");
            towerTwo1.getStyleClass().add("t2Upgrade");
            towerTwo2.getStyleClass().add("t2Upgrade");
            towerTwo3.getStyleClass().add("t2Upgrade");
            towerTwo4.getStyleClass().add("t2Upgrade");
            towerTwo5.getStyleClass().add("t2Upgrade");
            towerThree.getStyleClass().add("t3Upgrade");
            towerThree1.getStyleClass().add("t3Upgrade");
            towerThree2.getStyleClass().add("t3Upgrade");
            towerThree3.getStyleClass().add("t3Upgrade");
            towerThree4.getStyleClass().add("t3Upgrade");
            towerThree5.getStyleClass().add("t3Upgrade");
            towerThree6.getStyleClass().add("t3Upgrade");
            for (int i = 0; i < towerList.size(); i++) {
                if (towerList.get(i).getName().equals("Nop")) {
                    towerList.get(i).setDamage(2);
                } else if (towerList.get(i).getName().equals("Mop")) {
                    towerList.get(i).setDamage(3);
                } else if (towerList.get(i).getName().equals("Lop")) {
                    towerList.get(i).setDamage(4);
                }
            }
            player.setTowers(towerList);
            stage.setUserData(player);
        }
    }

    //Continue button to start game
    @FXML
    protected void startPress1(MouseEvent event1) throws IOException {
        Node node = (Node) event1.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Player player = (Player) stage.getUserData();
        if (player.getMoney() > 0) {
            orgSceneX = event1.getSceneX();
            orgSceneY = event1.getSceneY();
            orgTranslateX = ((Pane) (event1.getSource())).getTranslateX();
            orgTranslateY = ((Pane) (event1.getSource())).getTranslateY();


            if (orgSceneX >= 825) {
                Tower tower;
                if (orgSceneY <= 100) {
                    tower = new SimpleTower();
                } else if (orgSceneY >= 180 && orgSceneY <= 315) {
                    tower = new NormalTower();
                } else {
                    tower = new ExtremeTower();
                }
                previousMoney = player.getMoney();
                previousPrice = tower.getPrice(player.getDifficulty());
                player.buyTower(tower);
                towerList.add(tower);
                money.setText("$ " + player.getMoney());
                stage.setUserData(player);
            }
        } else {
            previousMoney = 0;
            previousPrice = 0;
        }
    }


    /**
     * ActionEvent for dragging towers
     * @param event2 for the tower
     */
    @FXML
    protected void drag1(MouseEvent event2) {
        Node node = (Node) event2.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        Player player = (Player) stage.getUserData();
        if ((previousPrice > previousMoney) || (player.getMoney() == 0 && previousMoney == 0)) {
            return;
        }
        double sceneX = event2.getSceneX();
        double sceneY = event2.getSceneY();
        int sceneXInt = (int) sceneX;
        int sceneYInt = (int) sceneY;
        double offsetX = sceneX - orgSceneX;
        double offsetY = sceneY - orgSceneY;
        double newTranslateX = orgTranslateX + offsetX;
        double newTranslateY = orgTranslateY + offsetY;
        //player.setNumtowersPlaced(player.getNumtowersPlaced() + 1);




        // RGB of path: 134,149,149. HEX game map: #869595
        Color pathColor = Color.web("#869595", 1.0);

        Image background = new Image("the/SkyWarriors/mappath.png");
        PixelReader pixelReader = background.getPixelReader();
        boolean checkDimension = (sceneXInt >= 825);

        upperLeftCornerX = sceneXInt - 33;
        upperLeftCornerY = sceneYInt - 46;

        upperRightCornerX = sceneXInt + 33;
        upperRightCornerY = sceneYInt  + 46;

        lowerLeftCornerX = sceneXInt - 33;
        lowerLeftCornerY = sceneYInt  - 46;

        lowerRightCornerX = sceneXInt + 33;
        lowerRightCornerY = sceneYInt - 46;

        checkBounds();

        if (checkDimension
            || !(pixelReader.getColor(upperLeftCornerX, upperLeftCornerY).equals(pathColor)
            || pixelReader.getColor(upperRightCornerX, upperRightCornerY).equals(pathColor)
            || pixelReader.getColor(lowerLeftCornerX, lowerLeftCornerY).equals(pathColor)
            || pixelReader.getColor(sceneXInt, sceneYInt).equals(pathColor)
            || pixelReader.getColor(lowerRightCornerX, lowerRightCornerY).equals(pathColor))) {
            ((Pane) (event2.getSource())).setTranslateX(newTranslateX);
            ((Pane) (event2.getSource())).setTranslateY(newTranslateY);
            towerList.get(towerList.size() - 1).setX(sceneX);
            towerList.get(towerList.size() - 1).setY(sceneY);
        }
        
    } // end of drag1

    // start animation once the start combat is clicked
    @FXML
    protected void animateEnemies(MouseEvent event3) throws InterruptedException, IOException {
        startCombat.setVisible(false);
        Path travelPath = createPath();
        Node node = (Node) event3.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        player = (Player) stage.getUserData();

        gameLoop = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (enemies.size() < enemiesGroup.getChildren().size()) {
                    for (int i = 0; i < enemiesGroup.getChildren().size(); i++) {
                        //handle enemy types
                        //will we have diff ghost arrays for each difficulty if that makes sense?
                        if ((i == 0) || (i == 1)) {
                            enemies.add(new SimpleEnemy());
                        } else if (i == 2) {
                            enemies.add(new NormalEnemy());
                        } else if (i == 3) {
                            enemies.add(new ExtremeEnemy());
                        } else {
                            enemies.add(new FinalBoss());
                        }
                        Enemy curEnemy = enemies.get(i);
                        curEnemy.setxPos(enemiesGroup.getChildren().get(i).getLayoutX());
                        curEnemy.setyPos(enemiesGroup.getChildren().get(i).getLayoutY());

                        PathTransition transition = new PathTransition(Duration.seconds(
                            curEnemy.getTimeToMonument()), travelPath);
                        transition.setNode(enemiesGroup.getChildren().get(i));
                        transition.setCycleCount(1);
                        transition.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);
                        transition.setOnFinished(new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                Bounds boundsInScene = transition.getNode().
                                        localToScene(transition.getNode().getBoundsInLocal());
                                System.out.println(transition.getNode().getId());
                                if (boundsInScene.getCenterX() >= 804) {
                                    PathTransition pathTransition = (PathTransition)
                                        actionEvent.getSource();
                                    Node node = pathTransition.getNode();
                                    Stage stage = (Stage) node.getScene().getWindow();
                                    try {
                                        player = (Player) stage.getUserData();
                                        player.takeAttack(50);
                                        health.setText("♥ " + player.getHealth());
                                        stage.setUserData(player);
                                        if (player.getHealth() == 0) {
                                            gameLoop.stop();
                                            Parent endScreenParent = null;
                                            try {
                                                endScreenParent = FXMLLoader.
                                                        load(getClass().getResource("endScreen.fxml"));
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }
                                            Scene endScreenScene = new Scene(endScreenParent,
                                                815, 625);
                                            PathTransition stageTransiton = (PathTransition)
                                                actionEvent.getSource();
                                            Stage appStage = (Stage) (stageTransiton.getNode().
                                                    getScene().getWindow());
                                            appStage.setUserData(player);
                                            appStage.setScene(endScreenScene);
                                            appStage.setResizable(false);
                                            appStage.show();
                                        }
                                    } catch (NullPointerException e) {
                                        System.out.println("health already 0");
                                    }
                                }
                            }
                        });
                        transition.setDelay(new Duration(i * 2000));
                        transitions.add(transition);
                    }
                    for (int j = 0; j < transitions.size(); j++) {
                        transitions.get(j).play();
                    }

                    player.setAnimationStarted(true);
                    player.setEnemies(enemies);
                    player.setTransitions(transitions);
                    stage.setUserData(player);
                }
                for (int i = 0; i < enemiesGroup.getChildren().size(); i++) {
                    //handle enemy types
                    //will we have diff ghost arrays for each difficulty if that makes sense?
                    Enemy curEnemy = enemies.get(i);
                    curEnemy.setxPos(enemiesGroup.getChildren().get(i).getTranslateX() - 55);
                    curEnemy.setyPos(enemiesGroup.getChildren().get(i).getTranslateY() + 334);
                }

                for (Tower tower : towerList) {
                    /* Intended behavior: start 1000 count as soon as hit first enemy.
                     If gets to 1000 and no enemy, reset to be able to hit at any time
                     */

                    if (((System.currentTimeMillis() - tower.getLastAttackClock()) % 10) == 0
                            || tower.getGameState()) {
                        tower.setGameState(true);
                        tower.setLastAttackClock(System.currentTimeMillis());
                        double towerX = tower.getX();
                        double towerY = tower.getY();
                        double towerRadius = tower.getRadius();
                        int towerDamage = tower.getDamage();
                        for (int i = 0; i < enemies.size(); i++) {
                            Enemy enemy = enemies.get(i);
                            Transition enemyTransition = transitions.get(i);
                            double enemyX = enemy.getxPos();
                            double enemyY = enemy.getyPos();
                            int enemyHealth = enemy.getHealth();
                            if (enemyHealth > 0) {
                                double dist = Math.pow(Math.pow(towerX - enemyX, 2)
                                    + Math.pow(towerY - enemyY, 2), .5);
                                if (dist < towerRadius && enemyX >= 0) {
                                    enemy.takeAttack(towerDamage);
                                    tower.setGameState(false);
                                    if (i == 0) {
                                        damage11.setText("♥ " + enemy.getHealth());
                                    } else if (i == 1) {
                                        damage12.setText("♥ " + enemy.getHealth());
                                    } else if (i == 2) {
                                        damage13.setText("♥ " + enemy.getHealth());
                                    } else if (i == 3) {
                                        damage14.setText("♥ " + enemy.getHealth());
                                    } else {
                                        damage15.setText("♥  " + enemy.getHealth());
                                    }
                                    if (enemy.getHealth() <= 0) {
                                        enemyTransition.stop();
                                        player.setEnemiesKilled(player.getEnemiesKilled() + 1);
                                        if (enemy instanceof FinalBoss) {
                                            gameLoop.stop();
                                            Parent winScreenParent =
                                                    null;
                                            try {
                                                winScreenParent = FXMLLoader.
                                                        load(getClass().getResource("winScreen.fxml"));
                                            } catch (IOException e) {
                                                e.printStackTrace();
                                            }
                                            Scene winScreenScene = new Scene(winScreenParent,
                                                    815, 625);
                                            stage.setUserData(player);
                                            stage.setScene(winScreenScene);
                                            stage.setResizable(false);
                                            stage.show();
                                        }
                                        player.addMoney(50);
                                        money.setText("$ " + player.getMoney());
                                    }
                                }
                            }
                        }
                        player.setEnemies(enemies);
                        player.setTransitions(transitions);
                        stage.setUserData(player);
                    }
                }
            }
        };
        gameLoop.start();

    }

    /*/populate array list of enemies
    public void createEnemies() {
        enemies = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            Enemy newEnemy;
            if (i < 4) {
                newEnemy = new SimpleEnemy();
            } else if (i < 8) {
                newEnemy = new NormalEnemy();
            } else {
                newEnemy = new ExtremeEnemy();
            }
            enemies.add(newEnemy);
        }
    }*/

    // create the path using a list of 2DPoint
    public List<Point2D> getWayPoints() {
        List<Point2D> path = new ArrayList<>();
        path.add(new Point2D.Double(4, 30));
        path.add(new Point2D.Double(320, 30));
        path.add(new Point2D.Double(320, -135));
        path.add(new Point2D.Double(515, -135));
        path.add(new Point2D.Double(515, 160));
        path.add(new Point2D.Double(715, 160));
        path.add(new Point2D.Double(715, -3));
        path.add(new Point2D.Double(859, -3));
        return path;
    }

    private Path createPath() {
        List<Point2D> waypoints = getWayPoints();
        Path path = new Path();
        for (Point2D point: waypoints) {
            if (path.getElements().isEmpty()) {
                path.getElements().add(new MoveTo(point.getX(), point.getY()));
            } else {
                path.getElements().add(new LineTo(point.getX(), point.getY()));
            }
        }

        return path;
    }
}

