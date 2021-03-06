/**
 * Created by Kalantaev Alexandr on 25.04.2016.
 */
public class LinkedList {
    public int value;
    public LinkedList next;

    //������ ���� ��� ��������� ������ ��������
    //���� ��� �������� ������ � ������ �� ��������� ������ ������� ������ � ���� ��� ��������, �� ��� �������� ������
    //� ������� ������ ������ �� ������� ������ ������� ������ � ���� ���� ������� ������ � ������ �� ������ ������
    //� ������� ��������� ��������� ������� � ������ �� ��������� ������. �.�. ���� ������ ������ ����� ����� �����������
    //��� ������ � ������.

    //�� ������� ������� ����� ����� �������, ��� ��� �������� ������� � ���� ����� ��� ����, ��� ������� �������� value
    //���� int, � ���� ���� ����� ��������� �������� ����������, � ������ ���� ������ next �� ������ ������ �� ���� �.� ������ �� ������ ����� ������

    public static void main(String[] args) {
        // ����� ��� ���������� ���� � ��������� ��� ����� � ������, �� � �������� ���
        int [] masiv = new int[3];
        masiv[0] = 5;
        masiv[1] = 6;
        masiv[2] = 7;

        //� �������� ������ ������ ����� ����� ��������� ��� ������, ��� ���� ��� ����� ������� ��� �������  ������ LinkedList
        //�������� � ���� value �������� � ������� ��� �������
        LinkedList linkedList0 = new LinkedList();// ������� ������
        linkedList0.value = 5;//��������� ��������
        LinkedList linkedList1 = new LinkedList();//������� ������
        linkedList1.value = 6;//��������� ��������
        LinkedList linkedList2 = new LinkedList();//������� ������
        linkedList2.value = 7;//��������� ��������
        //���������
        linkedList0.next = linkedList1; //������� ������ ����� �� ������
        linkedList1.next = linkedList2;//������� ������ ������ � ������
        // ������ ���� ����� (������) ������� �������, �� ����� �������� ������ � ������ ������� � ����� � ���� ������,
        // ��������, ������� �� ����� �������� �������� �������.
        System.out.println(linkedList0.next.next.value);
        //��� ��� ����������
        // � ��� ���� ������ linkedList0, �� �� �������� � ������� 26. ��� ������ ������ LincedList � �������� ���� ����
        //next, � ������� �� ��������� � ������ 33 ������ �� ��������� ������
        //� ������ 33 ������� ��� linkedList0.next = linkedList1, �� ����� ������
        // linkedList0.next.next.value ��������� linkedList1.next.value
        //����� �� ��������� ���������� � ���� ������� ������� � ����� � ���� ������ �� ������ ������, � ��� � �������� �������
        //����� �������� ���� value

        //���������� ����� �������� �� �������
        LinkedList linkedList = new LinkedList();
        LinkedList list = linkedList; // ����� ����� �������� ������ linkedList ���������, �� ����� �������� �� � ������ ������, ���� �� �������� ����� ������
        int v = 5;
        for (int i = 0; i<3; i++){
            linkedList.value = v++;
            linkedList.next = new LinkedList();
            linkedList = linkedList.next;
        }
        System.out.println(list.next.next.value);
        //���� ������� ��� �������� ������ ���, �� ����� ������� �� ����� ��� �������� ������.

        //��� ����������� ������, � �������� ���� ���� ������ � ���� ������ �� ��������� ������
        //����� ���� ����������� ������, (� �������� ��� ������ � ����) � ������� ���� ���� �������� ������
        //� ��� ���� ������ ���������� �� ��������� � ���������� ������
        //�.� � ������ ������������ ������ ������� � ������ next �� ����� ���� ������ ������ �� ������� ��������,
        //� � ������ ������������ ������ �� ����� ����������� � ����� �������

        //������, ������ ����������� ������ �� 15 ���������, ������� ����� ������� ������, ����� ������� ��� ����������
        //� ������ �� � �������� ���������� �������

        //��� ����� ������ �������
        //����� ��� ��������� ������ � ������ ������������� ��������, ���� �� ����� �������� ������ � ����� ������� ��� ��������
        //��� ���������� ��������� ����� ����� �������� �������, ���������� � ���� ������ �� ��������� ������ � ��������� ������
        //� � ������ ������� ��� ����� ������ ������� ������ �� ����� ������
        //� ������ �������� �������� � ������ ���������� ������ ����������� �� ��������� ������ ��������� �������� ������� �������
        //������� ����� ����������, � ������ �� �������� �� ����� ��������� ����� �����
        //��� ������ ���� ������
        //� ������ � ������� ���� ���������� ���������� � ���������� �������, �� ������ ��������� ������ ��������
        //� ��� ������������� ������ � ��� ���� ������ ������ �� ������ ������ � ��� ���������� ��������� ������ ��� ������� ��������
        //����� �������� ��������


    }
}
