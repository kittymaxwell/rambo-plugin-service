package rambo.plugin.service.common;

public class R<T> {

	private boolean flag;
	private Integer code;
	private String message;
	private Object data;
	private Long count;

	private R() {
	}

	private R(boolean flag, Integer code, String message) {
		super();
		this.flag = flag;
		this.code = code;
		this.message = message;
	}

	private R(boolean flag, Integer code, String message, Object data) {
		super();
		this.flag = flag;
		this.code = code;
		this.message = message;
		this.data = data;
	}

	private R(boolean flag, Integer code, String message, Object data, Long count) {
		super();
		this.flag = flag;
		this.code = code;
		this.message = message;
		this.data = data;
		this.count = count;
	}

	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	/**
	 * 返回成功消息
	 * @return Result
	 */
	public static R SUCCESS() {
		return new R(true, StatusCode.SUCCESS, "成功");
	}

	/**
	 * 返回成功消息
	 * @return Result
	 */
	public static R SUCCESS(Object data) {
		return new R(true, StatusCode.SUCCESS, "成功", data);
	}

	/**
     * 返回成功消息
     * @return Result
     */
    public static R SUCCESS(String message, Object data) {
        return new R(true, StatusCode.SUCCESS, "成功", data);
    }

	/**
	 * 返回成功消息
	 * @return Result
	 */
	public static R SUCCESS(Object data, Long count) {
		return new R(true, StatusCode.SUCCESS, "成功", data, count);
	}

	/**
	 * 返回失败消息
	 * @return Result
	 */
	public static R FAIL() {
		return new R(false, StatusCode.FAIL, "失败");
	}

	/**
	 * 返回失败消息
	 * @return Result
	 */
	public static R FAIL(String message) {
		return new R(false, StatusCode.FAIL, message);
	}

	/**
	 * 返回失败消息
	 * @return Result
	 */
	public static R FAIL(Integer code, String message) {
		return new R(false, code, message);
	}

	/**
	 * 返回登录失败的消息：用户名或密码错误
	 * @return Result
	 */
	public static R loginFAIL() {
		return new R(false, StatusCode.LOGINFAIL, "用户名或密码错误");
	}

	/**
	 * 返回权限不足
	 * @return Result
	 */
	public static R accessFAIL() {
		return new R(false, StatusCode.ACCESSFAIL, "权限不足");
	}

	/**
	 * 返回远程调用失败
	 * @return Result
	 */
	public static R remoteFAIL() {
		return new R(false, StatusCode.REMOTEFAIL, "远程调用失败");
	}

	/**
	 * 返回重复操作
	 * @return Result
	 */
	public static R repFAIL() {
		return new R(false, StatusCode.REPFAIL, "重复操作");
	}
}

