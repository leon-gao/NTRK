package com.NTRK.common;

import java.math.BigDecimal;

public interface CommonConstants {

    /** 杩斿洖缁撴灉 姝ｅ父鎵ц    */
    public static final String SUCCESS = "0";

    /** 杩斿洖缁撴灉  閿欒    */
    public static final String ERROR  = "1";

    /** 杩斿洖缁撴灉 璀﹀憡    */
    public static final String WRONG  = "2";

    /** 杩斿洖鐘舵�並EY    */
    public static final String STATUS = "status";

    /** 淇℃伅KEY  */
    public static final String ERROR_MESSAGE  = "errorMsg";

    public static final int NUMBER_ZERO = 0;
    
    /**BigDecimal鍒濆鍊�*/
    public static final BigDecimal BIGDECIMAL_ZERO = new BigDecimal("0.00");

    public static final int NUMBER_ONE = 1;

    public static final int NUMBER_TWO = 2;

    public static final int NUMBER_THREE = 3;

    public static final int NUMBER_FOUR = 4;

    public static final int NUMBER_FIVE = 5;

    public static final int NUMBER_SIX = 6;

    public static final int NUMBER_SEVEN = 7;

    public static final int NUMBER_EIGHT = 8;
    
    public static final int NUMBER_NINE = 9;
    
    public static final int NUMBER_TEN = 10;
    
    public static final int NUMBER_TWELVE = 12;
    
    public static final int NUMBER_ONE_HUNDRED = 100;

    public static final String STRING_ZERO = "0";

    public static final String STRING_ONE = "1";

    public static final String STRING_TWO = "2";

    public static final String STRING_THREE = "3";

    public static final String STRING_FOUR = "4";

    public static final String STRING_FIVE = "5";

    public static final String STRING_SIX = "6";

    public static final String STRING_SEVEN = "7";

    public static final String STRING_EIGHT = "8";
    
    public static final String STRING_NINE = "9";
    
    public static final String STRING_TEN = "10";
    
    public static final String IS_DELETED_NO = "0";
    
    public static final String IS_DELETED_YES = "1";

    /** 骞存湀 */
    public static final String YYYY_MM = "yyyy-MM";

    /** 骞存湀鏃� */
    public static final String YYYY_MM_DD = "yyyy-MM-dd";
    
    /**骞存湀鏃�  鍙冲垝绾�*/
    public static final String YY_MM_DD_RIGHT_CROSSED = "yy/MM/dd";

    /** 骞存湀鏃� 鏃跺垎*/
    public static final String YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";

    /** 骞存湀鏃� 鏃跺垎*/
    public static final String YY_MM_DD_HH_MM_RIGHT_CROSSED = "yy/MM/dd HH:mm";
    
    /** 骞存湀鏃� 鏃跺垎*/
    public static final String YY_MM_DD_HH_MM_SS_RIGHT_CROSSED = "yy/MM/dd HH:mm:ss";
    
    /** 骞存湀鏃� 鏃�*/
    public static final String YYYY_MM_DD_HH = "yyyy-MM-dd HH";

    /** 骞存湀鏃� 鏃跺垎绉�*/
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";
    
  
    /** 骞存湀(涓枃) */
    public static final String YYYYMM_ZH = "yyyy骞碝M鏈�";
    /** 骞存湀(涓枃) */
    public static final String MMDD_ZH = "MM鏈坉d鏃�";
    /** 骞存湀鏃�(涓枃) */
    public static final String YYYYMMDD_ZH = "yyyy骞碝M鏈坉d鏃�";
    /** 骞存湀鏃� 鏃跺垎(涓枃) */
    public static final String YYYYMMDDHHMM_ZH = "yyyy骞碝M鏈坉d鏃� HH:mm";

    /** 骞存湀鏃� 鏃跺垎绉�(涓枃) */
    public static final String YYYYMMDDHHMMSS_ZH = "yyyy骞碝M鏈坉d鏃� HH:mm:ss";

    /** 骞存湀鏃ユ椂鍒嗙姣*/
    public static final String YYYYMMDDHHMMSSMS = "yyyyMMddHHmmssms";
    /** 骞存湀鏃ユ椂鍒嗙姣*/
    public static final String YYYYMMDDHHMMSS = "yyyyMMddHHmmss";
    /** 骞存湀鏃� 鏃跺垎 */
    public static final String YYYYMMDDHHMM = "yyyyMMddHHmm";
    /***骞存湀鏃� 鏃跺垎绉�***/
    public static final String YYYYMMDD = "yyyyMMdd";

    /** 鏃跺垎*/
    public static final String HH_MM = "HH:mm";
    
    public static final String SPACE = " ";
    
    public static final String EMPTY = "";
    
    public static final String NULL = null;
    
    public static final String AND = "AND";
    
    public static final String DASH = "-";
    
    public static final String COLON = ":";
    /** 鍚庡彴绋嬪簭鍒犻櫎鐨勬渶缁堟洿鏂颁汉 */
    public final static String LAST_UPDATE_BY_FOR_SCHEDULE = "schedule";
    
    /** 绗笁绾у競鍦烘笭閬撶殑绫籘ype  */
    public static final String THIRD_CHANNEL_TYPE = "thirdChannel";
    /**
     * 鏀朵粯娆惧崟鍙峰墠缂�
     */
    public static final String FINANCIAL = "FI";
    
    /**
     * 鏀瑰寘鐢宠鍗曞彿鍓嶇紑
     */
    public static final String MODIFY_PACKAGE = "MP";
    /**
     * 淇敼璇峰亣娆℃暟鐢宠鍗曞彿鍓嶇紑
     */
    public static final String MODIFY_LEAVE_TIMES = "ML";
    
    /**
     * 杞腑蹇冪敵璇峰崟鍙峰墠缂�
     */
    public static final String TRANSFER_CENTER = "TC";
    
    /**
     * 鍚堝悓璐︽埛鍗曞彿鍓嶇紑
     */
    public static final String ACCOUNT = "ACT";
    
    /**
     * 搴斾粯鍗曞彿鍓嶇紑
     */
    public static final String AP_RECORD = "AP";
    /**
     * 杞簲鏀跺崟鍙峰墠缂�
     */
    public static final String AR_RECORD = "AR";
    /**
     * 閫�璇惧崟鍙峰墠缂�
     */
    public static final String REFUND_FORM = "RE";
    
    /**
     * 璧犺鍗曞彿鍓嶇紑
     */
    public static final String FREE_COURSE = "GC";

    /**
     * 璧犺鍗曞彿鍓嶇紑
     */
    public static final String CONTRACT_EXTENSION = "EX";
    
	
    public final static String NO_CLASS_HOUR_NUM = "璇炬椂鏁颁笉瓒充簡鍝︼紒";
	
    public final static String NC_ERROR = "宸茶秴杩囧懆閫夎涓婇檺锛�";

	public final static String NOT_IN_CONTARCT = "璇剧▼涓嶅湪鍚堝悓鍙笂璇鹃�傜敤鏃ュ唴锛�";
	
    public final static String SIGNIN_LESSON = "璇ヨ绋嬪凡绛惧埌锛屼笉鑳芥墽琛岃鎿嶄綔锛�";
	
    public final static String SIGNIN_TCH = "璇ユ椿鍔ㄥ凡绛惧埌锛屼笉鑳芥墽琛岃鎿嶄綔锛�";

    public final static String NO_CONTRACT = "娌℃湁鏈夋晥鐨勫悎鍚岋紝涓嶈兘鎵ц璇ユ搷浣滃摝锛�";

    public final static String END_CONTRACT = "鍚堝悓宸茶繃鏈燂紒";

    public final static String TCH_SIGN_IN_NO_CONTRACT = "{0}宸叉病鏈夋湁鏁堢殑鍚堝悓锛屼笉鑳界鍒颁簡鍝︼紒\n";

    public final static String TCH_SIGN_IN_END_CONTRACT = "{0}鐨勫悎鍚屽凡杩囨湡浜嗗摝锛乗n";

    public final static String TCH_SIGN_NO_CLASS_HOUR_NUM = "{0}鐨勫墿浣欒鏃舵暟涓嶈冻浜嗗摝锛乗n";
    
    public final static String HAS_SOMETHING_APPLYING = "宸叉湁{0}鐢宠锛岃绛夊叾瀹℃壒瀹屾垚鍚庡啀杩涜鐢宠銆�";
    
    public final static String HAS_APPLYING_FOR_TCH = "瀹㈡埛[{0}]宸叉湁{1}鏉{2}]鐢宠锛岃绛夊叾瀹℃壒瀹屾垚鍚庡啀杩涜[{3}]鎿嶄綔銆俓n";
    
    public final static String APPROVAL_PENDING = "寰呭鎵�";
    
    /**
     * 浠诲姟鏃堕棿瀛楁
     */
    public static final String COLUMN_TASK_TIME = "taskTime";
    
    /**
     * 闄嶅簭鎺掑簭:desc
     */
    public static final String SORT_TYPE_DESC = "desc";
    
    /**
     * 闄嶅崌搴忔帓搴�:desc
     */
    public static final String SORT_TYPE_ASC = "asc";
    
    /**
     * 	CODE_TYPE:閭�绾︾被浠诲姟鐘舵��
     */
    public static final String INVITE_TASK_STATUS = "inviteTaskStatus";
    
    /**
     * 	CODE_TYPE:鑱旂郴浠诲姟鐘舵��
     */
    public static final String CONTACT_TASK_STATUS = "contactTaskStatus";
    
    /**
     * 	CODE_TYPE:闈㈣皥浠诲姟鐘舵��
     */
    public static final String MEETING_TASK_STATUS = "meetingTaskStatus";
    
    /**
     * 	CODE_TYPE:绛剧害浠诲姟鐘舵��
     */
    public static final String CONTRACT_TASK_STATUS = "contractTaskStatus";
    
    /**
     * 	CODE_TYPE:鍏朵粬浠诲姟鐘舵��
     */
    public static final String OTHER_TASK_STATUS = "otherTaskStatus";
    
    /**
     * 	CODE_TYPE:绯荤粺浠诲姟鐘舵��
     */
    public static final String SYSTEM_TASK_STATUS = "systemTaskStatus";
    
    /**
     * 	CODE_TYPE:鏀舵鍐呭
     */
    public static final String FINANCIAL_CONTENT = "financialContent";
    /**
     * 	CODE_TYPE:閫�娆惧唴瀹�
     */
    public static final String REFUND_CONTENT = "refundContent";
    
    /**
     * 	涓婅涔犳儻CODE
     */
    public static final String QUESTION_TAB1 = "81001";
    
    /**
     * 	鎵嬫満鍙烽噸澶嶉獙璇丮ESSAGE:涓庢湰涓績leads閲嶅
     */
    public static final String MESSAGE_1 = "姝ゆ墜鏈哄彿宸插瓨鍦紝褰掑睘锛�";
    
    /**
     * 	鎵嬫満鍙烽噸澶嶉獙璇丮ESSAGE:鍦↙eads Pool
     */
    public static final String MESSAGE_2 = "姝ゆ墜鏈哄彿宸插瓨鍦紝褰掑睘锛氬緟鍒嗛厤";
    
    /**
     * 	鎵嬫満鍙烽噸澶嶉獙璇丮ESSAGE:鍦ㄥ洖鏀剁珯
     */
    public static final String MESSAGE_3 = "姝ゆ墜鏈哄彿宸插瓨鍦紝褰掑睘锛氬洖鏀剁珯涓�";
    
    /**
     * 	鎵嬫満鍙烽噸澶嶉獙璇丮ESSAGE:涓庝粬涓績leads閲嶅
     */
    public static final String MESSAGE_4 = "姝ゆ墜鏈哄彿宸插瓨鍦紝褰掑睘锛氬叾浠栦腑蹇冿紙鐐瑰嚮鏌ョ湅璇︽儏锛�";
    
    /**
     * 浼欎即360锛氭垜鐨勭哗鏁堝浘鐗囪矾寰�
     */
    public static String PERFORMANCE_PATH = "../../performance/";
    /**
     * 浼欎即360锛氳兘鍔涙垚灏卞浘鐗囪矾寰�
     */
    public static String CAPACITY_PATH = "../../capacity/";
    /**
     * 浼欎即360锛氱敓娲荤偣婊村浘鐗囪矾寰�
     */
    public static String DAILY_DETAIL_PATH = "../../dailydetail/";
    
    /**
     * 鎰忓悜搴︼細A
     */
    public static String INTENTION_73001 = "73001";
    
    /**
     * 鎰忓悜搴︼細B
     */
    public static String INTENTION_73002 = "73002";
    
    /**
     * 鎰忓悜搴︼細C
     */
    public static String INTENTION_73003 = "73003";
    
    /**
     * 鎰忓悜搴︼細D
     */
    public static String INTENTION_73004 = "73004";
    
}
