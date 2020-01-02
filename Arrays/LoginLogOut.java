
import java.util.*;
import java.lang.*;
public class LoginLogOut {

  private static class Session {
    String user;
    int login;
    int logout;

    public Session(String user, int login, int logout) {
      this.user = user;
      this.login = login;
      this.logout = logout;
    }
  }

  public static int maxUser(List<Session> sessions) {
    int in = 0;
    int out = 0;
    int max = 0;
    int maxUser = Integer.MIN_VALUE;
    List<Integer> logins = new ArrayList<>();
    List<Integer> logouts = new ArrayList<>();
    for (Session s : sessions) {
      logins.add(s.login);
      logouts.add(s.logout);
    }
    Collections.sort(logins, LoginComparator);
    Collections.sort(logouts, LoginComparator);

    while (in < logins.size() - 1 || out < logouts.size()-1) {
      if (logins.get(in) < logouts.get(out)) {
        max++;
        in++;
      }
      else {
        max--;
        out++;
      }
      maxUser = Math.max(max, maxUser);
    }
  return maxUser;   
  }

  public static Comparator<Integer> LoginComparator = new Comparator<Integer>() {
    @Override
    public int compare(Integer x, Integer y) {return x.compareTo(y);}
  };


  public static void main(String[] args) {
    List<Session> list = new ArrayList<>();
    list.add(new Session("A", 1, 3));
    list.add(new Session("B", 3, 4));
    list.add(new Session("C", 1, 3));
    list.add(new Session("D", 123, 987));
    list.add(new Session("E", 1, 3));
    System.out.println(maxUser(list));
  }
}
