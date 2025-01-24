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

    public Integer getProgramId() {
        return programId;
    }

    public void setProgramId(Integer programId) {
        this.programId = programId;
    }

    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}


