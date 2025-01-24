package model;

public class TrainingProgram {

        private Integer programId;
        private Integer coachId;
        private String name;
        private String description;
        private Integer duration; // in days
        private String difficultyLevel;

    public TrainingProgram(Integer programId, Integer coachId, String name, String description, Integer duration, String difficultyLevel) {
        this.programId = programId;
        this.coachId = coachId;
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.difficultyLevel = difficultyLevel;
    }

    public TrainingProgram() {
    }
}


