package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity
public class UploadFile {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// uploadFile
	public static Var upload() throws Exception {
		return new Callable<Var>() {

			private Var fileToRead = Var.VAR_NULL;
			private Var item = Var.VAR_NULL;
			private Var content = Var.VAR_NULL;

			public Var call() throws Exception {
				cronapi.util.Operations.upload(Var.VAR_NULL, Var.valueOf("*"), Var.valueOf("20MB"), Var.valueOf("true"),
						(sender_item) -> {
							item = Var.valueOf(sender_item);
							fileToRead = cronapi.io.Operations.fileOpenToRead(cronapi.list.Operations.getFirst(item));
							content = cronapi.io.Operations.fileReadContentWithCharset(fileToRead,
									Var.valueOf("UTF-8"));
							cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
									Var.valueOf("vars.textarea2138"), content);
						});
				return Var.VAR_NULL;
			}
		}.call();
	}

}
