/**
 * 
 */
var waitingDialog = waitingDialog || (function ($) {
	    'use strict';
	    var $dialog = $( // Creating modal dialog's DOM
	        '<div class="modal fade" data-backdrop="static" data-keyboard="false" tabindex="-1" role="dialog" aria-hidden="true" style="padding-top:15%; overflow-y:visible;">' +
	        '<div class="modal-dialog modal-m">' +
	        '<div class="modal-content">' +
	        '<div class="modal-header"><h3 style="margin:0;"></h3></div>' +
	        '<div class="modal-body">' +
	        '<div class="d-flex justify-content-center"><strong style="font-size: 20px;">Favor esperar... &emsp;</strong><div class="spinner-border" role="status"> <span class="sr-only">Loading...</span> </div></div>' +
	        '</div>' +  
	        '</div></div></div>');
	    return {               
	        show: function (message, options) {
	            if (typeof options === 'undefined') {// Assigning defaults
	                options = {};
	            }
	            if (typeof message === 'undefined') {
	                message = 'Loading';
	            }
	            var settings = $.extend({
	                dialogSize: 'm',
	                progressType: '',
	                onHide: null // This callback runs after the dialog was hidden
	            }, options);
	            // Configuring dialog
	            $dialog.find('.modal-dialog').attr('class', 'modal-dialog').addClass('modal-' + settings.dialogSize);
	            $dialog.find('h3').text(message);
	            if (typeof settings.onHide === 'function') {// Adding callbacks
	                $dialog.off('hidden.bs.modal').on('hidden.bs.modal', function (e) {
	                    settings.onHide.call($dialog);
	                });
	            }
	            $dialog.modal();// Opening dialog
	        },
	        hide: function () {// closes dialog
	            $dialog.modal('hide');
	        }
	    };

	})(jQuery);