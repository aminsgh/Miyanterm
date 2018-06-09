package aut.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Voting {
    private String question;

    HashMap< User,Integer> votingUserHashMap = new HashMap<>();

    public Voting() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voting voting = (Voting) o;
        return Objects.equals(question, voting.question) &&
                Objects.equals(votingUserHashMap, voting.votingUserHashMap);
    }

    @Override
    public int hashCode() {

        return Objects.hash(question, votingUserHashMap);
    }

    public void aVoting(User user, int choice) {
        votingUserHashMap.put(user,choice);

    }

    public void printUser() {
        System.out.println(votingUserHashMap.size());
    }

    public void numberOfChoice(int choice) {
        int i = 0;
        Integer integer = choice;

        for (Map.Entry< User,Integer> integerUserEntry : votingUserHashMap.entrySet()) {
            if (integerUserEntry.getValue().equals(integer)) {
                i++;

            }
        }
        System.out.println(i);
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }


}
