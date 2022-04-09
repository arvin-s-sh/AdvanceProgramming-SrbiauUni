package session5_2;

public class User<I , S> implements Cloneable {
    private S user ;
    private I pass ;
    private S email ;



    public S getUser() {
        return user;
    }

    public void setUser(S user) {
        this.user = user;
    }

    public I getPass() {
        return pass;
    }

    public void setPass(I pass) {
        this.pass = pass;
    }

    public S getEmail() {
        return email;
    }

    public void setEmail(S email) {
        this.email = email;
    }

    @Override
    public User<I, S> clone() {
        try {
            User clone = (User) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
