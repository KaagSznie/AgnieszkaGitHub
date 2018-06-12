
package revision;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String identityCardMember;
    private String familyName;
    private String firstName;

    public Person(String identityCardMember, String familyName, String firstName) {
        this.identityCardMember = identityCardMember;
        this.familyName = familyName;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Person{" + "identityCardMember=" + identityCardMember + ", familyName=" + familyName + ", firstName=" + firstName + '}';
    }
    
    

    public String getIdentityCardMember() {
        return identityCardMember;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setIdentityCardMember(String identityCardMember) {
        this.identityCardMember = identityCardMember;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public int compareTo(Person other) {
        return identityCardMember.compareTo(other.getIdentityCardMember());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.identityCardMember);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.identityCardMember, other.identityCardMember)) {
            return false;
        }
        return true;
    }
    
    
    
}
