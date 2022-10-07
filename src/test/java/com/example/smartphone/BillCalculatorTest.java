package com.example.smartphone;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.smartphone.options.CompensationService;
import com.example.smartphone.options.NetSecurity;
import com.example.smartphone.options.RemoteSupport;

public class BillCalculatorTest {
  @Test
  /** 補償サービス.遠隔サポート.ネットセキュリティ:1000円 */
  public void testCompensationRemoteSecurity(){
    int bill = BillCalculator.getBillPerMonth(
      new CompensationService(),
      new RemoteSupport(),
      new NetSecurity()
    );
    assertEquals(1000, bill);
  }

  @Test
  /** 補償サービス.遠隔サポート:730円 */
  public void testCompensationRemote(){
    int bill = BillCalculator.getBillPerMonth(
      new CompensationService(),
      new RemoteSupport()
    );
    assertEquals(730, bill);
  }

  @Test
  /** 補償サービス.ネットセキュリティ:830円 */
  public void testCompensationSecurity(){
    int bill = BillCalculator.getBillPerMonth(
      new CompensationService(),
      new NetSecurity()
    );
    assertEquals(830, bill);
  }

  @Test
  /** 補償サービス:330円 */
  public void testCompensation(){
    int bill = BillCalculator.getBillPerMonth(
      new CompensationService()
    );
    assertEquals(330, bill);
  }

  @Test
  /** 遠隔サポート.ネットセキュリティ:900円 */
  public void testRemoteSecurity(){
    int bill = BillCalculator.getBillPerMonth(
      new RemoteSupport(),
      new NetSecurity()
    );
    assertEquals(900, bill);
  }

  @Test
  /** 遠隔サポート:400円 */
  public void testRemote(){
    int bill = BillCalculator.getBillPerMonth(
      new RemoteSupport()
    );
    assertEquals(400, bill);
  }

  @Test
  /** ネットセキュリティ:500円 */
  public void testSecurity(){
    int bill = BillCalculator.getBillPerMonth(  
      new NetSecurity()
    );
    assertEquals(500, bill);
  }

  @Test
  /** オプションなし:0円 */
  public void testZeroOption(){
    int bill = BillCalculator.getBillPerMonth();
    assertEquals(0, bill);
  }
}
