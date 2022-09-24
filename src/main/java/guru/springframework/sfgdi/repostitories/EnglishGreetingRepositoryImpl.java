package guru.springframework.sfgdi.repostitories;

public class EnglishGreetingRepositoryImpl  implements EnglishGreetingRepository{

    @Override
    public String getGreeting() {
        return "Hello World - En";
    }
}
