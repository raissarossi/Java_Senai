package screens;

import entities.Food;
import entities.Restaurant;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MenuRest extends JPanel {
    private Restaurant restaurant;
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    private final DefaultListModel<String> modelNomeComida = new DefaultListModel<>();
    private final JList<String> listaComidas = new JList<>(modelNomeComida);
    public JButton backRest =  new JButton();
    public MenuRest(){
        setLayout(null);
        setBackground(Color.BLUE);
        setDefaultLocale(null);

        backRest.setBounds(10, 10, 80, 20);
        backRest.setText("Back");
        add(backRest);

        listaComidas.setBounds( 100, 100, 200, 400);
        add(listaComidas);
    }
    public void refresh(){
        modelNomeComida.removeAllElements();
        for (Food food : restaurant.getComidas()){
            System.out.println(food.getName());
            modelNomeComida.addElement(food.getName());
        }
    }




}
