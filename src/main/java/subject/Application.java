package MySubject.Run;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        VGAmanagement vgamg = new VGAmanagement();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==== VGA 정보 등록 프로그램 ====");
            System.out.println("===== 1. VGA 카드정보 추가 =====");
            System.out.println("===== 2. VGA 카드정보 조회 =====");
            System.out.println("===== 3. VGA 카드정보 수정 =====");
            System.out.println("===== 4. VGA 카드정보 삭제 =====");
            System.out.println("=== 5. VGA 등록정보 전체조회 ===");
            System.out.println("===== 9.   프로그램 종료 =======");
            System.out.print("메뉴를 선택하세요 : ");

            int select = sc.nextInt();
            sc.nextLine();

            switch (select) {
                case 1 :
                    System.out.print("등록할 카드 번호 : ");
                    int vganum = sc.nextInt();
                    sc.nextLine();
                    System.out.print("카드 이름 : ");
                    String name = sc.nextLine();
                    System.out.print("제조 회사 : ");
                    String brand = sc.nextLine();
                    System.out.print("부스트 클럭 수치 : ");
                    int mhz = sc.nextInt();
                    System.out.print("스트림 프로세서 개수 : ");
                    int stream = sc.nextInt();
                    System.out.print("정격 파워 용량 : ");
                    int power = sc.nextInt();
                    System.out.print("전원 포트의 요구 핀수 : ");
                    int port = sc.nextInt();
                    System.out.print("카드 쿨링 팬의 수 : ");
                    int pan = sc.nextInt();
                    System.out.print("카드의 가격은 : ");
                    int price = sc.nextInt();
                    sc.nextLine();
                    vgamg.addVgaCard(vganum,name,brand,mhz,stream,power,port,pan,price);
                    break;

                case 2 :
                    System.out.print(" 조회할 카드등록 번호 : ");
                    vganum = sc.nextInt();
                    vgamg.getVgaCard(vganum);
                    break;

                case 3 :
                    System.out.print(" 수정할 카드등록 번호 : ");
                    vganum = sc.nextInt();
                    sc.nextLine();
                    System.out.print("수정할 카드 이름 : ");
                    name = sc.nextLine();
                    System.out.print("수정할 제조 회사 : ");
                    brand = sc.nextLine();
                    System.out.print("수정할 부스트 클럭 수치 : ");
                    mhz = sc.nextInt();
                    System.out.print("수정할 스트림 프로세서 개수 : ");
                    stream = sc.nextInt();
                    System.out.print("수정할 정격 파워 용량 : ");
                    power = sc.nextInt();
                    System.out.print("수정할 전원 포트의 요구 핀수 : ");
                    port = sc.nextInt();
                    System.out.print("수정할 카드 쿨링 팬의 수 : ");
                    pan = sc.nextInt();
                    System.out.print("수정할 카드의 가격은 : ");
                    price = sc.nextInt();
                    sc.nextLine();
                    vgamg.updateVgaCard(vganum, name, brand, mhz, stream, power, port, pan, price);
                    break;

                case 4 :
                    System.out.print("삭제할 카드등록 번호 : ");
                    vganum = sc.nextInt();
                    vgamg.deleteVgaCard(vganum);
                    break;

                case 5 :
                    System.out.println("등록한 카드 전체 조회");
                    vgamg.getAllVgaCard();
                    break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;

                default:
                    System.out.println("잘못된 숫자를 입력하였습니다. 다시 입력해주세요");
            }
        }
    }
}
