window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ChangeView = window.blockly.js.blockly.ChangeView
		|| {};

var item;

/**
 * changeView
 */
window.blockly.js.blockly.ChangeView.Execute = function() {
	this.cronapi.screen.changeView("#/home/admin/upload", []);
}
