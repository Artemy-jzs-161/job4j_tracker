package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {

    public static double averageScore(List<Pupil> pupils) {
        double sum = 0;
        int count = 0;

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                count++;
            }
        }

        return count == 0 ? 0 : sum / count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labelList = new ArrayList<>();

        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }

            double avg = pupil.subjects().isEmpty() ? 0 : sum / pupil.subjects().size();
            labelList.add(new Label(pupil.name(), avg));
        }

        return labelList;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> sum = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();
        List<Label> result = new ArrayList<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                sum.merge(subject.name(), subject.score(), Integer::sum);
                count.merge(subject.name(), 1, Integer::sum);
            }
        }

        for (String subject : sum.keySet()) {
            double avg = (double) sum.get(subject) / count.get(subject);
            result.add(new Label(subject, avg));
        }

        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        Label best = null;

        for (Pupil pupil : pupils) {
            double sum = 0;

            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }

            if (best == null || sum > best.score()) {
                best = new Label(pupil.name(), sum);
            }
        }

        return best;
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> map = new HashMap<>();
        Label best = null;

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                map.merge(subject.name(), subject.score(), Integer::sum);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (best == null || entry.getValue() > best.score()) {
                best = new Label(entry.getKey(), entry.getValue());
            }
        }

        return best;
    }
}
