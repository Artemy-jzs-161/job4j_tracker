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
        List<Label> result = new ArrayList<>();

        for (Pupil pupil : pupils) {
            double sum = 0;

            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }

            double avg = sum / pupil.subjects().size();
            result.add(new Label(pupil.name(), avg));
        }

        return result;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                int score = map.getOrDefault(subject.name(), 0);
                map.put(subject.name(), score + subject.score());
            }
        }

        List<Label> result = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            double avg = (double) entry.getValue() / pupils.size();
            result.add(new Label(entry.getKey(), avg));
        }

        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> labels = new ArrayList<>();

        for (Pupil pupil : pupils) {
            double sum = 0;

            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }

            labels.add(new Label(pupil.name(), sum));
        }

        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                int score = map.getOrDefault(subject.name(), 0);
                map.put(subject.name(), score + subject.score());
            }
        }

        List<Label> labels = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            labels.add(new Label(entry.getKey(), entry.getValue()));
        }

        labels.sort(Comparator.naturalOrder());
        return labels.get(labels.size() - 1);
    }
}
