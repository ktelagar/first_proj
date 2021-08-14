package CleanCode.constructorVSStaticFactory;

@SuppressWarnings("ALL")
public class ConstVsStaticFacMeth {

  public class User {

    private final String name;
    private final String email;
    private final String country;

    public User(String name, String email, String country) {
      this.name = name;
      this.email = email;
      this.country = country;
    }
  }

  // My requirement is that every User created must have a default Country as India..
  //How can it be achieved?


}
