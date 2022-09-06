package peaksoft.service;

import peaksoft.model.Lesson;

import java.util.List;

public interface LessonService {

    void saveLesson(Long courseId, Lesson lesson);

    void updateLesson(Long id,Lesson lesson);

    List<Lesson> getAllLessons(Long id);

    Lesson getLessonById(Long id);

    void deleteLessonById(Long id);
}
