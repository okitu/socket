package wbemdisp;

/**
 * COM Interface 'ISWbemPropertySet'. Generated 21.04.2014 14:38:47
 * from 'C:\Windows\System32\wbem\wbemdisp.tlb'<P>
 * Generated using com2java Version 64.00 (c) 2012 Intrinsyc Software International, Inc.  All rights reserved.
 * See  <A HREF="http://j-integra.intrinsyc.com/">http://j-integra.intrinsyc.com/</A><P>
 * Description: '<B>A collection of Properties</B>'
 *
 * Generator Options:
 *   AwtForOcxs = False
 *   PromptForTypeLibraries = False
 *   RetryOnReject = False
 *   IDispatchOnly = False
 *   GenBeanInfo = False
 *   LowerCaseMemberNames = False
 *   TreatInStarAsIn = False
 *   ArraysAsObjects = False
 *   OmitRestrictedMethods = False
 *   ClashPrefix = ��=
 *   ImplementConflictingInterfaces = False
 *   DontRenameSameMethods = False
 *   RenameConflictingInterfaceMethods = False
 *   ReuseMethods = False
 *
 * Command Line Only Options:
 *   MakeClsidsPublic = False
 *   DontOverwrite = False
 */
public interface ISWbemPropertySet {
  /**
   * get_NewEnum. 
   *
   * @return    An enumeration.
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public java.util.Enumeration get_NewEnum  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * Item. Get a named Property from this collection
   *
   * @param     strName The strName (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @return    A reference to a wbemdisp.ISWbemProperty
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemProperty Item  (
              String strName,
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * getCount. The number of items in this collection
   *
   * @return    The iCount
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public int getCount  () throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * Add. Add a Property to this collection
   *
   * @param     strName The strName (in)
   * @param     iCimType A wbemdisp.WbemCimtypeEnum constant (in)
   * @param     bIsArray The bIsArray (in, optional, pass false if not required)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @return    A reference to a wbemdisp.ISWbemProperty
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public wbemdisp.ISWbemProperty Add  (
              String strName,
              int iCimType,
              boolean bIsArray,
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException;

  /**
   * Remove. Remove a Property from this collection
   *
   * @param     strName The strName (in)
   * @param     iFlags The iFlags (in, optional, pass 0 if not required)
   * @exception java.io.IOException If there are communications problems.
   * @exception com.linar.jintegra.AutomationException If the remote server throws an exception.
   */
  public void Remove  (
              String strName,
              int iFlags) throws java.io.IOException, com.linar.jintegra.AutomationException;


  // Constants to help J-Integra for COM dynamically map DCOM invocations to
  // interface members.  Don't worry, you will never need to explicitly use these constants.
  int IIDdea0a7b2_d4ba_11d1_8b09_00600806d9b6 = 1;
  /** Dummy reference to interface proxy to make sure it gets compiled */
  int xxDummy = ISWbemPropertySetProxy.xxDummy;
  /** Used internally by J-Integra for COM, please ignore */
  String IID = "dea0a7b2-d4ba-11d1-8b09-00600806d9b6";
  String DISPID__4_GET_NAME = "get_NewEnum";
  String DISPID_0_NAME = "Item";
  String DISPID_1_GET_NAME = "getCount";
  String DISPID_2_NAME = "Add";
  String DISPID_3_NAME = "Remove";
}
