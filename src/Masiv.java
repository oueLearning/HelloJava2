/**
 * Created by Kalantaev Alexandr on 20.04.2016.
 */
public class Masiv {
    public static void main(String[] args) {
        // ����� ��� ����� ��������� ������ ����
        //� ������������ ��������

        //��� ���������� ������ �� ��������� ��� ������
        //� ����������� ��� ���������� (��� ������) �� �������� ����� ����������� ��������� � ����(� ������)

        int[] masivIntov; //����� �����
        String[] masivStringov; // ����� ��������
        Masiv[] masivObjektov; // ����� �������� ������ Masiv

        // ����� ��� ��������� ������ � ������������� ��������
        //�� ����� ��� ������������� ������ ���������� ������� ��� ������
        //��� ��� ����� �������� ������(�������������) ��� ������ �������� �� ��������

        masivIntov = new int[4];
        //������ masivIntov ��� �������� ������� ������ � ������� ����� ���������� 4 �������� ���� int
        // ���� ������������� ����� �������� �� ���� int �������� 4 �����
        // � ������ ��� �������� ������� ������ �������� 4(��������)*4(�����)=16 ������ ��� 16*8=128 �����

        // �� ��������� �������� ��������� ������ ����������� ���������� �� ��������� ��� ����������� ���� ������.
        //��� int �������� �� ��������� ����� 0
        //�.�. ����� ������������� ���������� �� ��������
        //����� (������� ������) �� 4 �������� � ��� �������� ����� 0
        // [0,0,0,0]
        // ������ � ��������� ������ ��������������� �� ������� ���������� � ���������� ������� ����� ����� ����������
        //���������� ���������� � ����
        //�.�. � ��������� ������� ������ ����� ���������� ��������� ������� 0,1,2,3  (����� 4 ������� ��� � ��������� ������)
        System.out.println(masivIntov[1]);//������, �� ���������� � �������� ������ � �������� 1, �.�. �� ������� ��������
        //��� �� �������, �� ���������� � ������� ������ ������� ��������� �� ������ masivIntov(� ������ ���� ������),
        //jvm ����� ��� ��� ���������� ������ ������ �� ������� ��� ��� ����� �������� ��� ������ int ������� �������� � ������ 4 �����
        //�� ����� �������� �������� � �������� 1 ����� ���������� ����� 4 � 9 ������� (5,6,7,8) ������ ��������� ��� ������
        // jvm ��������� ������ ����� � �������� �� �� ��������� ������ println() ������� ������� ������ � �������
        //� ������ ��������� � ��������������� �������� ������ (�������� masivIntov[5]) �� ���������� � ������ ������� ��������
        // ��� ����� (� ������ � ��� 16 ������) �� ���������� � 17, 18, 19, 20 ������, �� �� ���. ��� ������ ����������� ������� �������.
        //��������������� ��������� �� ���������� � ��������������� �������� �� ������� ����������.

        //���������� ��������� ��������
        //���� �� ����� �������� ������� �������� � �����(��������� � ������) �� ������ ��������� ������ ������ ��� ��������

        masivIntov[1] = 2; // �.� ������ � �������� 1 ������  �� ����������� �������� 2
        // ��� � ������ ��������� �� 5 �� 9�� ������ �� ���������� �������� ������������� ������ � �������
        // ����� �� ����� ��������� � ���� ������ �� ��� ����� ��������� 2 (� �������� ���� ��� ���� ��� 00000000 00000000 00000000 00000010)

        // �������� ��� �������� ���
        // ������ ��������� ��� ������ ������ � �������� 1 ����� �������� 00000000 00000000 00000000 00000000
        // � �� ������� ������ � ��� ������ 2, � ����� ��������           00000000 00000000 00000000 00000010


        //���� ��� ���� ������������ ������ �� ������ �� ����� � ���������� ��� ����� �� ����� ��������� �������� ������
        //������ ���������� ���� �� ����
        int i = masivIntov[1]; // �� ����������� ���������� ���� int �������� ����������� � ������ ��� �������� 1
        // ��� ���������� � �������????
        // ������ ������� �������� ���������� i �� �� ��� �� ������ �� ��� �����


    }
}
