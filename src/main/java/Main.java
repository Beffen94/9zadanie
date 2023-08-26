public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        FormData birthday = new FormData();

        birthday.day = 3;
        birthday.month = 12;
        birthday.year = 1990;

        post.birthday = birthday;


        post.name = "Роман";
        post.patronymic = "Александрович";
        post.surname = "Быков";
        post.birthday.day = 3;
        post.birthday.month = 12;
        post.birthday.year = 1990;
        post.passport = "1961 № 090334";
        post.phone = "+7 (921)-124-19-61";
        post.subscription = true;
    }
}
