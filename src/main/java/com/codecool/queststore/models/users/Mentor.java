package com.codecool.queststore.models.users;

import com.codecool.queststore.models.Module;
import com.codecool.queststore.models.Quest;
import com.codecool.queststore.models.Reward;
import com.codecool.queststore.models.Role;

import java.util.List;

public class Mentor extends User{
    private int mentorId;
    private List<Module> modules;
    private List<Reward> rewards;
    private List<Quest> quests;

    public Mentor(int id, String firstName, String lastName, Role role, boolean isActive, String email, String password, String salt) {
        super(id, firstName, lastName, role, isActive, email, password, salt);
    }

    public Mentor(){};

    public int getMentorId() {
        return mentorId;
    }

    public void setMentorId(int mentorId) {
        this.mentorId = mentorId;
    }

    public List<Module> getModules() {
        return modules;
    }

    public List<Reward> getRewards() {
        return rewards;
    }

    public List<Quest> getQuests() {
        return quests;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public void setRewards(List<Reward> rewards) {
        this.rewards = rewards;
    }

    public void setQuests(List<Quest> quests) {
        this.quests = quests;
    }


    @Override
    public String toString() {
        return "Mentor{" +
                "mentorId=" + mentorId +
                ", modules=" + modules +
                ", rewards=" + rewards +
                "} " + super.toString();
    }
}