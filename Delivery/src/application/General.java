package application;

import entities.Restaurant;
import screens.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

public class General extends JFrame {
    Login login = new Login();
    Home home = new Home();
    Register register = new Register();
    RestaurantsList restaurantsList = new RestaurantsList();
    MenuRest menuRest = new MenuRest();
    ArrayList<Restaurant> restaurants = new ArrayList<>();
    public General(){
        setSize(500,800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(home);
        addAllListeners();
        home.setVisible(true);
        setAllRestaurants();
        setAllFoods();
        setVisible(true);
    }
    public void setAllRestaurants(){
        restaurants.add(new Restaurant(0, "RaissasFoood"));
        restaurants.add(new Restaurant(1, "Dadora"));
    }

    public void setAllFoods(){
        restaurants.get(0).addFood("Lanchinho", 10F);
        restaurants.get(0).addFood("torta de limão", 20.99F);
        restaurants.get(1).addFood("torta de limão", 20.99F);
    }

    public void addAllListeners(){
        home.goLogin.addActionListener(e -> {
            home.setVisible(false);
            super.setContentPane(login);
            login.setVisible(true);
        });
        home.goRegister.addActionListener(e -> {
            home.setVisible(false);
            super.setContentPane(register);
            register.setVisible(true);
        });


        login.enterBtn.addActionListener(e -> {
            login.setVisible(false);
            super.setContentPane(restaurantsList);
            restaurantsList.setRestaurantes(restaurants);
            restaurantsList.refresh();
            restaurantsList.setVisible(true);
        });
        login.backHome.addActionListener(e -> {
            login.setVisible(false);
            super.setContentPane(home);
            home.setVisible(true);
        });


        register.enterBtn.addActionListener(e -> {
            register.setVisible(false);
            super.setContentPane(home);
            home.setVisible(true);
        });
        register.backHome.addActionListener(e -> {
            register.setVisible(false);
            super.setContentPane(home);
            home.setVisible(true);
        });


        restaurantsList.listaRestaurants.addListSelectionListener(e->{
            if (e.getValueIsAdjusting()){
                return;
            }
            boolean ativar = false;
            String nomeRest = restaurantsList.listaRestaurants.getSelectedValue();
            for (Restaurant rest : restaurants){
                System.out.println(rest.getName());
                if (Objects.equals(nomeRest, rest.getName())){
                    System.out.println(rest.getName());
                    menuRest.setRestaurant(rest);
                    ativar = true;
                }
            }
            if (ativar){
                restaurantsList.setVisible(false);
                super.setContentPane(menuRest);
                menuRest.refresh();
                menuRest.setVisible(true);
            }

        });


        menuRest.backRest.addActionListener(e -> {
            menuRest.setVisible(false);
            super.setContentPane(restaurantsList);
            restaurantsList.setVisible(true);
        });
    }
}
