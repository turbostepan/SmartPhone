package org.example;

import java.util.Scanner;

class SmartPhone {

    private static Scanner scanner = new Scanner(System.in);

    public static class Contacts {
        private String name;
        private String phoneNumber;

        public Contacts(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void callContact() {
            System.out.println("Вызываемый абонент: " + name + " по номеру " + phoneNumber);
        }
    }

    public static class Camera {
        private boolean isCameraOpen;

        public void openCamera() {
            isCameraOpen = true;
            System.out.println("Выберите камеру: \n 1 - Основная \n 2 - Фронтальная");
            int y = scanner.nextInt();
            System.out.println("Щелк");
            System.out.println("Фото добавлено в галлерею");
        }

        public void takePhoto() {



                System.out.println("Включите каммеру");

        }
    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();

        Contacts contact1 = new Contacts("Даниил", "+79999999999");
        Contacts contact2 = new Contacts("Бардель", "+49816824055");
        Contacts contact3 = new Contacts("Владимир", "+79818919181");

        System.out.println("Телефон включен");
        System.out.println("1 - позвонить");
        System.out.println("2 - включить камеру");
        System.out.println("3 - сделать фото");

        int x = scanner.nextInt();

        switch (x) {
            case 1:
                System.out.println("Выберите контакт: ");
                int y = scanner.nextInt();
                if (y == 1){
                smartPhone.callContact(contact1);}
                else if (y==2) {
                    smartPhone.callContact(contact2);}
                else if (y==3) {
                    smartPhone.callContact(contact3);}
                else {System.out.println("Нет контакта");};
                break;
            case 2:
                smartPhone.openCamera();
                break;
            case 3:
                smartPhone.takePhoto();
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
    }

    private void callContact(Contacts contact) {
        contact.callContact();
    }

    private void openCamera() {
        Camera camera = new Camera();
        camera.openCamera();
    }

    private void takePhoto() {
        Camera camera = new Camera();
        camera.takePhoto();
    }
}