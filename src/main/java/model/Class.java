package model;

public class Class {
    int ClassId;
    String ClassRoom;

    public Class(int classId, String classRoom) {
        ClassId = classId;
        ClassRoom = classRoom;
    }

    public Class(String classRoom) {
        ClassRoom = classRoom;
    }

    public int getClassId() {
        return ClassId;
    }

    public void setClassId(int classId) {
        ClassId = classId;
    }

    public String getClassRoom() {
        return ClassRoom;
    }

    public void setClassRoom(String classRoom) {
        ClassRoom = classRoom;
    }
}
